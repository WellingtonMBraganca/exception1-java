//import java.util.Scanner;

//01#
//
//public class lista6Vetor {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        double[] v1 = new double[3];
//        double[] v2 = new double[3];
//        int counter = 0;
//
//
//        for (int i = 0; i < v1.length; i++) {
//            System.out.print("Numero v1:");
//            v1[i] = sc.nextDouble();
//        }
//        for (int i = 0; i < v2.length; i++) {
//            System.out.print("Numero v2:");
//            v2[i] = sc.nextDouble();
//        }
//
//        for (int i = 0, j = v2.length - 1; i < v1.length; i++, j--) {
//            if (v1[i] == v2[j]){
//                counter++;
//            }
//        }
//
//        if (counter == v1.length){
//            for (int i = 0; i < v2.length; i++) {
//                v2[i] += v2[i];
//                System.out.print(v2[i] + ", ");
//            }
//        }else {
//            System.out.println("All the values are not the same.");
//        }
//    }
//}


import java.util.Scanner;

//02#
public class lista6Vetor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] v = new double[5];
        double number;
        int contador = 0;
        for (int i = 0; i < v.length; i++) {
            System.out.println(v[i]);
        }
        System.out.print("Primeiro número: ");
        number = sc.nextDouble();
        v[0] = number;
        int i = 0;

        do {
            System.out.print("Número: ");
            number = sc.nextDouble();
            for (int j = 0; j < v.length; j++) {
                if (v[i] != 0 && number < ){

                }
            }
        }
    }
}