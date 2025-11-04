import entities.Client;

public class ProgarmEqualsHashCode {
    public static void main(String[] args) {
        Client c1 = new Client("jeandrus@gmail.com", "jeandrus");
        Client c2 = new Client("jeandrus@gmail.com", "jeandrus");


        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());
        System.out.println(c1.equals(c2));
        System.out.println(c1 == c2);
        //a comparação com sinal de igualdade, compara endereço de memória em heap...
        // e não o conteudo em si. se quisermos comparar conteudo, devemos utilizar hash e equals.


    }
}
