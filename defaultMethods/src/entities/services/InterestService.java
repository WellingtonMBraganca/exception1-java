package entities.services;

import java.security.InvalidParameterException;

public interface InterestService {

    double getInterestRate();
    //podemos utilizar metodos padrao (default), diretamente na interface
    //quando é um metodo comum a toda subclasse que implemente a interface.
    //serndo assim, evitamos repetição de código, colocando simplesmente
    //o metodo no contrato, e tendo de escreve-lo em cada subclasse.

    default double payment(double amount, int months) {
        if (months < 1) {
            throw new InvalidParameterException("Months must be greater than zero");
        }
        return amount * Math.pow(1.0 + getInterestRate() / 100.0, months);
    }
}