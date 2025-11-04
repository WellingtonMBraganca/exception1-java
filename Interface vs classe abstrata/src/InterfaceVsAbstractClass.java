public class InterfaceVsAbstractClass {
    /*classe abstrata
    INTERFACE - contrato que suas subclasses PRECISAM cumprir.
    Abstract class - Conceito de herança, polimorfismo e Override.


   classe abstrata Shape

    Shape{
        -color: Color;
        area(): Double;
    }

    Rectangle{                Circle{
        width: Double;           radius: Double;
        heigth: Double;          area(): Double;
        area(): Double;             }
    }


    aqui temos a subclasse retangulo e circulo que erdam color de shape,
    e possuem suas proprias metricas de  calculo de area;


    interface shape

    interface Shape{
            area(): double;
        }

    abstract Shape{
            color: Color;
        }

         Rectangle{                Circle{
        width: Double;           radius: Double;
        heigth: Double;          area(): Double;
        area(): Double;             }
    }


     ja aqui temos uma interface shape, qu estabelece um contrato para que circulo e retangulo
     tenham area, herdando cor de uma classe abstrata, evitando assim repetição de codigo e
     tendo a obrigatoriedade de ter um calculo de area, ou seja, existe o beneficio de ambas
     classes (interface e abstract).
     */



}
