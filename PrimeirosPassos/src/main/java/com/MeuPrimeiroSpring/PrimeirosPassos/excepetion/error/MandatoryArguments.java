package com.MeuPrimeiroSpring.PrimeirosPassos.excepetion.error;

public class MandatoryArguments extends RuntimeException{

    public MandatoryArguments(String message){
        super(message);
    }

}
