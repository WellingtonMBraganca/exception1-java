import exemplo.Circle;
import exemplo.Color;
import exemplo.Rectangle;
import exemplo.abstrato.Shape;

import java.sql.SQLOutput;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Shape s1 = new Circle(Color.COR1, 2.0);
        Shape s2= new Rectangle(Color.COR2, 3.0, 4.0);
        //lembrando que devemos instanciar a classe abstrata, caso contrrio,
        //não havera o atributo Color, ausente na interface.

        System.out.println("CIRCLE COLOR: " +  s1.getColor());
        System.out.println("CIRCLE AREA: " + s1.area());

        System.out.println("RECTANGLE COLOR: " +  s2.getColor());
        System.out.println("RECTANGLE AREA: " + s2.area());
    }
}