//import java.util.Scanner;

//#01
//public class lista2 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int[] numeros = new int[10];
//        for (int i = 0; i < numeros.length; i++) {
//            System.out.print("Numero:");
//            numeros[i] = sc.nextInt();
//        }
//
//        for (int i = 0; i < numeros.length - 1; i++) {
//            if (numeros[i] == numeros[i + 1] - 2){
//                System.out.println("Numero " + numeros[i] + " atende a regra.");
//            }
//        }
//        {
//
//        }
//    }
//}


//#02
//import java.util.Scanner;
//
//public class lista2 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        int[] vet1 = new int[3];
//        int[] vet2 = new int[3];
//
//        for(int i = 0; i < vet1.length; i++){
//            System.out.print("Numero: ");
//            vet1[i] = sc.nextInt();
//        }
//        for(int i = 0; i < vet2.length; i++){
//            System.out.print("Numero: ");
//            vet2[i] = sc.nextInt();
//        }
//
//        for (int i = 0, j = vet2.length - 1; i < vet1.length; i++, j--){
//            int prod = vet1[i] * vet2[j];
//            System.out.print(prod + ", ");
//        }
//    }
//}


//import java.util.Scanner;
//
/// /#03
//import java.util.Scanner;
//
//public class lista2 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        int[] vet1 = new int[3];
//        int[] vet2 = new int[3];
//
//        for(int i = 0; i < vet1.length; i++){
//            System.out.print("Numero vet1: ");
//            vet1[i] = sc.nextInt();
//        }
//        for(int i = 0; i < vet2.length; i++){
//            System.out.print("Numero vet2: ");
//            vet2[i] = sc.nextInt();
//        }
//
//        for (int i = 0; i < vet1.length; i++){
//            for (int j = 0; j < vet2.length; j++) {
//                int prod = vet1[i] * vet2[j];
//                System.out.print(prod + ", ");
//            }
//        }
//    }
//}


import java.util.Scanner;

public class lista2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char condicao;
        int choice, casa, rentedHouseCounter = 0;
        double totalRent, rent = 500.00;
        int[] houseList = new int[100];

        do {
            System.out.println("Digite uma opção:");
            System.out.print("1 - Aluguel de casa;\n"
                    + "2 - Liberação de casa;\n"
                    + "3 - Valor a receber;\n"
                    + "4 - Busca de casa livre.\n");
            choice = sc.nextInt();

            if (choice == 1) {
                System.out.print("Informe uma casa com valores de 0 a 99: ");
                casa = sc.nextInt();
                if (houseList[casa] == 0) {
                    System.out.println("Casa reservada com sucesso!");
                    houseList[casa] = 1;
                } else System.out.println("Desculpe, casa ocupada.");
            } else if (choice == 2) {
                System.out.print("Qual casa gostaria de liberar? ");
                casa = sc.nextInt();
                if (houseList[casa] != 0) {
                    System.out.println("Casa liberada com sucesso!");
                    houseList[casa] = 0;
                } else System.out.println("Casa já liberada.");
            } else if (choice == 3) {
                for (int x : houseList) {
                    if (x != 0) {
                        rentedHouseCounter++;
                    }
                }
                totalRent = rent * rentedHouseCounter;
                System.out.println("Valor total dos alugueis de "
                        + rentedHouseCounter
                        + " casas: "
                        + String.format("%.2f.", totalRent));
            } else if (choice == 4) {
                System.out.println("As casas disponiveis no momento são: ");
                for (int i = 0; i < houseList.length; i++) {
                    if (houseList[i] == 0) {
                        System.out.print(i + ", ");
                    }
                }
            } else System.out.print("Opção inválida...");
            sc.nextLine();
            System.out.print("Gostaria de continuar? (s/n)");
            condicao = sc.nextLine().charAt(0);

        } while (condicao == 's');
    }
}