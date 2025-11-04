import entities.Product;

import java.util.HashMap;
import java.util.Map;

public class Exemplo1 {
    public static void main(String[] args) {
        Map<Product, Double> stock = new HashMap<>();

        Product p1 = new Product("Tv", 900.00);
        Product p2 = new Product("Note", 1200.00);
        Product p3 = new Product("Tablet", 50.99);

        stock.put(p1, 10.0);
        stock.put(p2, 20.0);
        stock.put(p3, 30.0);


        Product ps = new Product("Tv", 900.00);

//        Comparação se da por meio do HashCode e Equals, logo essa linha abaixo,
//        sem o hashCode, sera false...
        System.out.println("Contains 'ps' key? " + stock.containsKey(ps));

    }
}
