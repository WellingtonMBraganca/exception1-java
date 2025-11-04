package entities;

import java.util.Objects;

public class Product {
    private String name;
    private Double price;

    public Product(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

//    @Override
//    public boolean equals(Object o) {
//        if (o == null || getClass() != o.getClass()) return false;
//        Product exemplo1 = (Product) o;
//        return Objects.equals(name, exemplo1.name);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hashCode(name);
//    }
}
