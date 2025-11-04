package entities;

public class InterfacesFuncionaisTeoria {
    /*Interfaces que possuem um unico metoo abstrato.
    Implementação é uma expressão lambda

    PREDICATE<T t>

    removeIf(Predicate)

    METODO ABSTRATO TEST
    POR EXEMPLO p -> p.getPrice() >= 100 ONDE OBJETO P RETONA UM BOOLEAN SE SEU VALOR FOR
    MAIOR OU IGUAL A 100;
    NO CASO É UM METODO QUE TESTA UMA DETERMINADA EXPRESSAO,

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



    CONSUMER<T t>

    forEach(Consumer)

    METODO ABSTRATO ACCEPT
    METODO ABSTRATO VOID TIPO T

    DA MESMA FORMA CONSUMER PODE SER UTILIZADO IMPLEMENTANDO UMA CLASSE QUE IMPLEMENTA CONSUMER
    COMO UM METODO DIRETO NA CLASSE PRODUCT, SEJA ESTATICO OU NÃO OU COMO UMA EXPRESSAO
    DIRETAMNETE COMO ARGUMENTO.

    CONSUMMER PODE SER UTILIZADO PARA ATUALIZAR OS PREÇOS DE TODOS OS PRODUTOS, COMO NO EXEMPLO ACIMA...
     POR EXEMPLO NESSE CASO DOS PRODUTOS TEMOS:

     METODO REFERENCIA ESTATICO
     List.ForEach(Product::staticPriceUpdate);

     METODO REFERENCIA NÃO ESTATICO
     List.ForEach(Product::nonStaticUpdate);

     LAMBDA DECLARADA EM VARIAVEL.

     Consumer<Product> con = p -> p.setPrice(p.getPrice * 1.1);
     list.ForEach(con);

     LAMBDA DIRETAMENTE COMO ARGUMENTO

     list.ForEach(p -> p.setPrice(p.getPrice * 1.1));


     FUNCTION<T ,R>

     map(Function)

     METODO ABSTRATO APPLY
     RECEBE OBJETO TIPO T E RETORNA OBJETO TIPO R.

     UTILIZA-SE FUNÇÃO map, a qua é diferente da estrutura de dados Map.
     Função que aplica uma função a todos os elementos de uma stream...

     Para TRANSFORMAR LIST EM STREAM:
     algo.stream()
     PARA RETORNAR ESSA STREAM PARA List
     algo.collect(Collectors.toList())

     POR CLASSE IMPLEMENTANDO O METODO
     List<String> list2 = list.stream().map(new UppercaseName()).collect(Collectors.toList());

     se faz necessario a conversao para nova lista de strings...

     MAP: APLICA UMA DETERMINADA FUNÇÃO A UMA STREAM, A CADA ELEMENTO DA LISTA.

     POR METODO ESTATICO DIRETAMENTE EM PRODUCT
     List<String> list2 = list.stream().map(Product::staticToUpperCase().collect(Collectors.toList());

     POR METODO NÃO ESTATICO DIRETAMENTE EM PRODUCT
     List<String> list2 = list.stream().map(Product::nonStaticToUpperCase()).collect(Collectors.toList());

     POR DECLARAÇÃO EM VARIAVEL

     Function<Product, String> func = p -> p.getName().toUpperCase();
     List<String> list2 = list.stream().map(func).collect(Collectors.toList());

     DIRETAMENTE COMO ARGUMENTO

     List<String> list2 = list.stream().map(p -> p.getName().toUpperCase()).collect(Collectors.toList());


     */
}
