import domain.domainExceptions.DomainExceptions;
import domain.entities.Account;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try{
            System.out.println("Digite os dados da conta.");
            System.out.print("Account number: ");
            int aNumber = sc.nextInt();
            sc.nextLine();
            System.out.print("Account holder: ");
            String aHolder = sc.nextLine();
            System.out.print("Withdraw limit: ");
            double withdrawLimit = sc.nextDouble();
            double inicialBalance = 0.0;

            Account account = new Account(aNumber, aHolder, inicialBalance, withdrawLimit);

            System.out.print("Initial deposit: ");
            Double value = sc.nextDouble();
            account.deposit(value);

            System.out.print("Enter the amount for withdraw: ");
            account.withdraw(sc.nextDouble());
            System.out.println(account.getBalance());
        }
        catch(DomainExceptions de){
            System.out.println("Error: " + de.getMessage());
        }
        catch(RuntimeException rte){
            System.out.println("Unexpected error.");
        }
    }
}