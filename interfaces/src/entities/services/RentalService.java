package entities.services;

import entities.CarRental;
import entities.Invoice;

import java.time.Duration;

public class RentalService {
    private Double pricePerDay;
    private Double pricePerHour;

    private TaxService taxService;
//aqui temos apenas a interface(abstrata, genérica) interagindo com essa classe, e a classe concreta que for
//ser utilizada deve apenas cumprir o contrato que ela estabelece.

//TAmbem temos um fator de grande importancia que é a injeção de dependencia de taxService no contrutor
//isso é uma forma de inversao de controle, onde um componente externo instancia a dependencia.
    public RentalService(Double pricePerDay, Double pricePerHour, TaxService taxService) {
        this.pricePerDay = pricePerDay;
        this.pricePerHour = pricePerHour;
        this.taxService = taxService;
    }

    public void processInvoice(CarRental carRental){
        double minutes = Duration.between(carRental.getStart(), carRental.getFinish()).toMinutes();
        double hours = minutes / 60;

        double basicPayment = 0;
        if (hours <= 12){
            basicPayment = pricePerHour * Math.ceil(hours);
        }else {
            basicPayment = pricePerDay * Math.ceil(hours / 24);
        }

        double tax = taxService.tax(basicPayment);

        carRental.setInvoice(new Invoice(basicPayment, tax));
    }

}
