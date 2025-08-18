package model.exceptions;

public class DomainException extends Exception{
    //em uma excessao podemos extende-la como eException ou RunTimeException, sendo que
    // quando utilzamos exception, o compilador nos obriga a trata-la, e em RunTime não.

    public DomainException(String msg){
        super(msg);
    }
}
