package com.MeuPrimeiroSpring.PrimeirosPassos.excepetion;

import com.MeuPrimeiroSpring.PrimeirosPassos.excepetion.error.DoubleEmail;
import com.MeuPrimeiroSpring.PrimeirosPassos.excepetion.error.MandatoryArguments;
import com.MeuPrimeiroSpring.PrimeirosPassos.excepetion.error.UserNotFond;
import com.MeuPrimeiroSpring.PrimeirosPassos.excepetion.expetionresponse.ExcepetionResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;

import java.util.Date;


@RestControllerAdvice
public class ExcepetionHandler {

    @ExceptionHandler(MandatoryArguments.class)
    public ResponseEntity<ExcepetionResponse> mandatoryArguments(MandatoryArguments e, WebRequest request){
        ExcepetionResponse excepetionResponse = new ExcepetionResponse(
          HttpStatus.BAD_REQUEST,
          e.getMessage(),
          request.getDescription(false),
          new Date());

        return new ResponseEntity(excepetionResponse, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(UserNotFond.class)
    public ResponseEntity<ExcepetionResponse> userNotFond(UserNotFond e, WebRequest request){
        ExcepetionResponse excepetionResponse=new ExcepetionResponse(
          HttpStatus.NOT_FOUND,
          e.getMessage(),
          request.getDescription(false),
          new Date());
        return new ResponseEntity(excepetionResponse, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(DoubleEmail.class)
    public ResponseEntity<ExcepetionResponse> doubleEmail(DoubleEmail e, WebRequest request){
        ExcepetionResponse excepetionResponse = new ExcepetionResponse(
          HttpStatus.CONFLICT,
          e.getMessage(),
          request.getDescription(false),
          new Date());

        return new ResponseEntity(excepetionResponse, HttpStatus.CONFLICT);
    }
}
