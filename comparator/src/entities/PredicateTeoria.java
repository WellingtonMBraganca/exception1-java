package entities;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PredicateTeoria {
    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();

        list.add(new Product("TV", 9000.00));
        list.add(new Product("NOTE", 19000.00));
        list.add(new Product("TABLET", 80.00));
        list.add(new Product("MONITOR", 50.00));

        //REFERENCE STATIC METHOD
        //Colocamos o nome da classe onde o metodo esta :: e o metodo.
//        list.removeIf(Product::metodoEstaticoReferenciado);
//        for (Product p: list){
//            System.out.println(p);
//        }

        //REFERENCE NON STATIC METHOD
//        list.removeIf(Product::metodoNaoEstaticoReferenciado);

        //LAMBDA DECLARADA
        //Declaramos a expressao em uma variavel..
//
//        Predicate<Product> pred = p -> p.getPrice() >= 100;
//        list.removeIf(pred);


        //EXPRESSAO LAMBDA INLINE
        //EXPRESSAO DIRETO COMO ARGUMENTO.
        list.removeIf(p -> p.getPrice() >= 100);

        for (Product p: list){
            System.out.println(p);
        }
    }
}
