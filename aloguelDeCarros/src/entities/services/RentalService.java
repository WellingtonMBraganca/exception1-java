package entities.services;

import entities.domain.CarRental;
import entities.domain.Invoice;

import java.time.Duration;

public class RentalService {
    private Double pricePerHour;
    private Double pricePerDay;

    private TaxService taxService;

    public RentalService(Double pricePerHour, Double pricePerDay, TaxService taxService) {
        this.pricePerHour = pricePerHour;
        this.pricePerDay = pricePerDay;
        this.taxService = taxService;
    }

    public Double getPricePerHour() {
        return pricePerHour;
    }

    public void setPricePerHour(Double pricePerHour) {
        this.pricePerHour = pricePerHour;
    }

    public Double getPricePerDay() {
        return pricePerDay;
    }

    public void setPricePerDay(Double pricePerDay) {
        this.pricePerDay = pricePerDay;
    }

    public void processInvoice(CarRental carRental) {
        double duration = Duration.between(carRental.getStart(), carRental.getFinish()).toMinutes();

        double totalValue;

        if (duration / 60 <= 12) {
            totalValue = getPricePerHour() * (duration / 60);
        } else {
            duration = Math.ceil(duration / 60 / 24);
            totalValue = duration * getPricePerDay();
        }

        double tax = taxService.tax(totalValue);
        carRental.setInvoive(new Invoice(totalValue, tax));
    }
}
