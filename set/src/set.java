import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class set {
    public static void main(String[] args) {

        /*
        Temos 3 modalidades de set, sendo hashSet, treeSet e linkedHashSet
        Obs: o Set testa igualdade pelo hash code  e equals, logo devemos implementa-los na classe.

        HASHSET
        Não mantem ordem dos itens, porem é o conjuntomais rapido.
        Para qualquer problema que não seja importante manter uma ordem, é a melhor opção.

        TREESET
        mais lento e ordenado pelo Compareto
        Para ordenarmos o treeSet, devemos implementar na classe o Comparable,
        e estabelecer o que iremos usar para comparar.

        LINKEDHASHSET
        mais rapido que o treeSet e ordenado pela ordem de inserção.
         */
        /*
        Set<String> set = new LinkedHashSet<>();
        set.add("TV");
        set.add("Notebook");
        set.add("Tablet");

//        set.remove("Tablet");
//        set.removeIf(x -> x.length() >= 3);

        for (String p : set) {
            System.out.println(p);
        }

         */

        Set<Integer> a = new TreeSet<>(Arrays.asList(0, 2, 4, 5, 6, 8, 10));
        Set<Integer> b = new TreeSet<>(Arrays.asList(5, 6, 7, 8, 9, 10));
//union
        Set<Integer> c = new TreeSet<>(a);
        c.addAll(b);
        System.out.println(c);
//intersection
        Set<Integer> d = new TreeSet<>(a);
        d.retainAll(b);
        System.out.println(d);
//difference
        Set<Integer> e = new TreeSet<>(a);
        e.removeAll(b);
        System.out.println(e);
    }
}