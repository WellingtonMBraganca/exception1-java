package application;

import entities.CarRental;
import entities.Vehicle;
import entities.services.BrazilTaxServices;
import entities.services.RentalService;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        System.out.println("Entre com os dados do aluguel.");
        System.out.print("Modelo do carro: ");
        String carModel = sc.nextLine();
        System.out.print("Retirada (dd/MM/yyyy hh:mm): ");
        LocalDateTime start = LocalDateTime.parse(sc.nextLine(), fmt);
        System.out.print("Retirada (dd/MM/yyyy hh:mm): ");
        LocalDateTime finish = LocalDateTime.parse(sc.nextLine(), fmt);

        CarRental cr = new CarRental(start, finish, new Vehicle(carModel));

        System.out.print("Price per hour: ");
        double pricePerHour = sc.nextDouble();
        System.out.print("Price per day: ");
        double pricePerDay = sc.nextDouble();

        RentalService rentalService = new RentalService(pricePerDay, pricePerHour, new BrazilTaxServices());

        rentalService.processInvoice(cr);

        System.out.println("FATURA: ");
        System.out.println("PAGAMENTO BASICO: " + cr.getInvoice().getBasicPayment());
        System.out.println("IMPOSTO: " + cr.getInvoice().getTax());
        System.out.println("PAGAMENTO TOTAL: " + cr.getInvoice().getTotalPayment());

    }
}
