package entities.services;

public interface TaxService {
    double tax(double amount);
}

//aqui temos uma interface, que é um contrato que uma determinada classe deve cumprir.
//No caso temos a brazilTaxervice que cumpre esse contrato, mas poderia ser USA ou qualquer outra
//Qualquer outra classe que interaja com essa taxService não precisa ser modificada caso,
//seja necessáio utilizar tax de um pais ou outro.
