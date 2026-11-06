package com.MeuPrimeiroSpring.PrimeirosPassos.excepetion.expetionresponse;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Date;

@Getter
@AllArgsConstructor
public class ExcepetionResponse {

    private Object status;
    private String message;
    private String details;
    private Date date;

}
