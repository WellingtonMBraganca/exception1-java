import model.entities.Reservations;
import model.exceptions.DomainException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        //Forma ruim de resolver as exceções

        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        try{
            System.out.print("Room number:");
            int roomNumber = sc.nextInt();

            System.out.print("Checkin date (dd/mm/yyyy): ");
            Date checkin = sdf.parse(sc.next());
            System.out.print("Checkout date (dd/mm/yyyy): ");
            Date checkout = sdf.parse(sc.next());


            Reservations reservation = new Reservations(roomNumber, checkin, checkout);
            System.out.println("Reservation: " + reservation);

            System.out.println();
            System.out.println("Enter data to update the reservation:");

            System.out.print("Checkin date (dd/mm/yyyy): ");
            checkin = sdf.parse(sc.next());
            System.out.print("Checkout date (dd/mm/yyyy): ");
            checkout = sdf.parse(sc.next());

            reservation.updateDates(checkin, checkout);
            System.out.println("Reservation: " + reservation);
        }
        catch(ParseException pe){
            System.out.println("Invalid date format, you must use dd-mm-yyyy.");
        }
        catch(DomainException de){
         //aqui tratamos a Domain exception no bloco catch.
            //capturamos a excessao propagada.
            System.out.println("Error in reservation: " + de.getMessage());
        }
        catch (RuntimeException rte){
            //podemos deixar esse bloco catch para qualquer outra excessao nao esperada
            //por exemplo o usuario digitar letras no campo de data...
            System.out.println("Unexpected error.");
        }

//esse metodo não é bom pois ocorre delegação de funções da Reserva no programa principal.
// quem deve tratar de questoes de reserva é a classe reserva.


    }
}