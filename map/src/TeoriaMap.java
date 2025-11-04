import java.sql.SQLOutput;
import java.util.Map;
import java.util.TreeMap;

public class TeoriaMap {
    public static void main(String[] args) {
        /*
        SINTAXE
        Class, <key, value> = Treemap<>() ou HashMap ou LinkedHashMap
        HashMap - mais rapido, desordenado;
        treemap - mais lento, ordenado pelo compare to;
        LinkedHashMap - intermediario, ordem em que sao adicionados.

        Comparações com base em HashCode e Equals.

        KeySet() - metodo que retorna as chaves contidas no Map
         */
        Map<String, String> cookies = new TreeMap<>();

        cookies.put("username", "Frederico");
        cookies.put("email", "fredericodogãobobao@algumDominio.com");
        cookies.put("phone", "999999999");

        cookies.remove("email");

//        caso haja outra entrad de chave igual, no caso 2 phone... o map substitui o valor anterior.
        cookies.put("phone", "88888888");
        System.out.println("Saber se a chave existe: " + cookies.containsKey("phone"));
        System.out.println("obter valor por chave: " + cookies.get("username"));
        System.out.println("Caso chave não exista, retrna null: " + cookies.get("email"));
        System.out.println("Size: " + cookies.size());

        System.out.println("All cookies. ");

        for (String key  : cookies.keySet()){
            System.out.println(key + ": " + cookies.get(key));
        }
    }
}
