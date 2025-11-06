package problemaMotivador.program;

import problemaMotivador.service.PrintService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("quantos numeros? ");
        int n = sc.nextInt();

        PrintService ps = new PrintService();

        for (int i = 0; i < n; i++) {
            System.out.print("digite numero: ");
            ps.addValue(sc.nextInt());
        }

        ps.print();

        System.out.println(ps.first());
    }
}