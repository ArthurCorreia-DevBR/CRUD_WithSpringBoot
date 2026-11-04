package com.MeuPrimeiroSpring.PrimeirosPassos.excepetion.error;

public class UserNotFond extends RuntimeException{

    public UserNotFond(String message){
        super(message);
    }
}
