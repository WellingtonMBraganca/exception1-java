import entities.Product;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;

public class TeoriaComparator {
    public static void main(String[] args) {
        List<Product> productList = new ArrayList<>();

        productList.add(new Product("TV", 900.00));
        productList.add(new Product("Notebook", 9900.00));
        productList.add(new Product("Dung", 99.00));

 /*
        //Variavel de comparação direto no programa...
        Comparator<Product> comp = new Comparator<Product>() {
            @Override
            public int compare(Product p1, Product p2) {
                return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
            }
        };


       // classe abstrata
        productList.sort(comp);

       // LAMBDA
        Comparator<Product> comp = (p1, p2) -> {
            return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
        };

       // Com expressao lambda
        productList.sort(comp);

       // LAMBDA REDUZIDA
        Comparator<Product> comp = (p1, p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());

      //  COM lAMBDA REDUZIDA
        productList.sort(comp);
       */


//        Passando LAMBDA direto como argumento...

        productList.sort((p1, p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase()));

        /*para o metodo sort, se faz necessario um mecanismo de comparação, podendo ser
        uma classe separada que implemente a interface comparable, uma classe abstrata diretamente
        no programa pricipqal... ou uma expreção lambda.
         */


        for (Product p: productList){
            System.out.println(p);
        }


    }
}
