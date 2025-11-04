package application;

import entities.domain.Contract;
import entities.domain.Installment;
import entities.service.ContractService;
import entities.service.PaypalService;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Entre os dados do contrato:");
        System.out.print("Numero contrato: ");
        int contractNumber = sc.nextInt();
        System.out.print("Data: ");
        LocalDate date = LocalDate.parse(sc.next(), dtf);
        System.out.print("Contract value: ");
        double contractValue = sc.nextDouble();

        Contract contract = new Contract(contractNumber, date, contractValue);

        System.out.print("Number of installments: ");
        int numberOfInstallments = sc.nextInt();

        ContractService contractService = new ContractService(new PaypalService());

        contractService.processContract(contract, numberOfInstallments);

        for (Installment installment : contract.getInstallment()) {
            System.out.println(installment);
        }
    }
}
