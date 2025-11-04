package problemaMotivador.service;

import java.util.ArrayList;
import java.util.List;

public class PrintService {
    private List<Integer> numeros = new ArrayList<>();

    public void addValue(int value){
        numeros.add(value);
    }

    public int first(){
        if (numeros.isEmpty()){
            throw new IllegalStateException("Lista vazia...");
        }
        return numeros.get(0);
    }

//minha forma
//    public int first (){
//        return numeros.getFirst();
//    }

    public void print(){
        for (Integer e: numeros){
            System.out.println(e.toString());
        }
    }
}
