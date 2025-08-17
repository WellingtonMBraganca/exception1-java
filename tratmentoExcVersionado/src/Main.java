import model.entities.Reservations;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        //Forma ruim de resolver as exceções

        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("Room number:");
        int roomNumber = sc.nextInt();

        System.out.print("Checkin date (dd/mm/yyyy): ");
        Date checkin = sdf.parse(sc.next());
        System.out.print("Checkout date (dd/mm/yyyy): ");
        Date checkout = sdf.parse(sc.next());

        if (!checkout.after(checkin)) {
            System.out.println("Error in reservation: Checkout date must not bo before checkin date.");
        } else {
            Reservations reservation = new Reservations(roomNumber, checkin, checkout);
            System.out.println("Reservation: " + reservation);

            System.out.println();
            System.out.println("Enter data to update the reservation:");
            System.out.print("Checkin date (dd/mm/yyyy): ");
            checkin = sdf.parse(sc.next());
            System.out.print("Checkout date (dd/mm/yyyy): ");
            checkout = sdf.parse(sc.next());

            Date now = new Date();
            if (checkin.before(now) || checkout.before(now)) {
                System.out.println("Error in reservation: Reservation dates for update must be future dates.");
            } else if (!checkout.after(checkin)) {
                System.out.println("Error in reservation: Checkout date must not bo before checkin date.");
            } else {
                reservation.updateDates(checkin, checkout);
                System.out.println("Reservation: " + reservation);
            }
        }


    }
}