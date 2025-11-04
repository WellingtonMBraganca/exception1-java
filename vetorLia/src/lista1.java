//#01
//public class lista1 {
//    public static void main(String[] args) {
//        double[] randonNumbers = new double[10];
//
//                int counter = 0;
//        for (int i = 0; i < randonNumbers.length; i++) {
//            randonNumbers[i] = Math.ceil(Math.random() * 100);
//
//            for (double x: randonNumbers){
//                if (x > 30){
//                    System.out.println(x);
//                    counter ++;
//                }
//            }
//        }
//            if(counter == 0){
//                System.out.println("No number above 30...");
//            }
//
//    }
//}

//#02
//public class lista1 {
//    public static void main(String[] args) {
//        double[] randonNumbers = new double[150];
//
//        int counter = 0;
//
//        for (int i = 0; i < randonNumbers.length; i++) {
//            randonNumbers[i] = Math.ceil(Math.random() * 1000);
//        }
//
//        for (int i = 0; i < randonNumbers.length; i+= 2) {
//            System.out.println(randonNumbers[i]);
//        }
//
//    }
//}


//#03
//public class lista1 {
//    public static void main(String[] args) {
//        double[] randonNumbers = new double[150];
//
//        int counter = 0;
//
//        for (int i = 0; i < randonNumbers.length; i++) {
//            randonNumbers[i] = Math.ceil(Math.random() * 1000);
//        }
//
//        for (int i = 0; i < randonNumbers.length; i+= 2) {
//            System.out.println(randonNumbers[i]);
//        }
//
//    }
//}


//#04
//public class lista1 {
//    public static void main(String[] args) {
//        double[] randonNumbers = new double[50];
//        double total = 1;
//
//        for (int i = 0; i < randonNumbers.length; i++) {
//            randonNumbers[i] = Math.ceil(Math.random() * 100);
//        }
//
//        for (int i = 0; i < randonNumbers.length; i++) {
//            if (randonNumbers[i] % 4 == 0){
//                total = total * randonNumbers[i];
//            }
//        }
//
//        System.out.println(String.format("%.2f", total));
//    }
//}

//import java.util.Scanner;
//
//public class lista1 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        double[] randonNumbers = new double[10];
//
//        for (int i = 0; i < randonNumbers.length; i++) {
//            randonNumbers[i] = Math.ceil(Math.random() * 100);
//        }
////        for (int i = 0; i < randonNumbers.length; i++) {
////            System.out.println("numero");
////            randonNumbers[i] = sc.nextDouble();
////        }
//        System.out.println(randonNumbers.length);
//
//        for (int i = randonNumbers.length - 1; i >= 0; i--) {
//            System.out.println(randonNumbers[i]);
//        }
//    }
//}


//#05
public class lista1 {
    public static void main(String[] args) {
        double[] randonNumbers = new double[10];

        for (int i = 1; i < randonNumbers.length; i++) {
            randonNumbers[i] = i;

        }

        for (int i = 0, j = 1; i < randonNumbers.length; i += 2, j+=2) {
            System.out.println("primeiro: " + randonNumbers[i]);
            System.out.println("segundo: " + randonNumbers[j]);
        }


    }
}