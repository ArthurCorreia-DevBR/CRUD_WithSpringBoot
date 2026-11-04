package com.MeuPrimeiroSpring.PrimeirosPassos.excepetion.error;

public class DoubleEmail extends RuntimeException{

    public DoubleEmail(String message){
        super(message);
    }

}
