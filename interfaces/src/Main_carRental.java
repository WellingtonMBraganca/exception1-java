import entities.CarRental;
import entities.Vehicle;

import javax.swing.text.DateFormatter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Main_carRental {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        System.out.println("Entre com os dados do aluguel");
        System.out.print("Modelo do carro: ");
        String carModel = sc.nextLine();
        System.out.println("Retirada (dd/MM/yyyy hh:mm):");
        LocalDateTime start = LocalDateTime.parse(sc.nextLine(), df);
        System.out.println("Retorno (dd/MM/yyyy hh:mm):");
        LocalDateTime finish = LocalDateTime.parse(sc.nextLine(), df);
        CarRental carRental = new CarRental(start, finish, new Vehicle(carModel));
    }
}