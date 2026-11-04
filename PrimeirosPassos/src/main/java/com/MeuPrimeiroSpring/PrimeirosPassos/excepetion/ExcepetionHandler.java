package com.MeuPrimeiroSpring.PrimeirosPassos.excepetion;

import com.MeuPrimeiroSpring.PrimeirosPassos.excepetion.error.DoubleEmail;
import com.MeuPrimeiroSpring.PrimeirosPassos.excepetion.error.MandatoryArguments;
import com.MeuPrimeiroSpring.PrimeirosPassos.excepetion.error.UserNotFond;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.Map;

@RestControllerAdvice
public class ExcepetionHandler {

    @ExceptionHandler(MandatoryArguments.class)
    public ResponseEntity mandatoryArguments(MandatoryArguments e){
        Map<String, Object> fullError = Map.of(
                "message", e.getMessage(),
                "status", 400,
                "error", HttpStatus.BAD_REQUEST.getReasonPhrase()
        );

        return ResponseEntity.badRequest().body(fullError);
    }

    @ExceptionHandler(UserNotFond.class)
    public ResponseEntity userNotFond(UserNotFond e){
        Map<String, Object> fullerror = Map.of(
                "status", 404,
                "message", e.getMessage(),
                "error", HttpStatus.NOT_FOUND.getReasonPhrase()
        );

        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(fullerror);
    }

    @ExceptionHandler(DoubleEmail.class)
    public ResponseEntity doubleEmail(DoubleEmail e){
        Map<String, Object> fullError = Map.of(
                "status", 400,
                "message", e.getMessage(),
                "error", HttpStatus.BAD_REQUEST.getReasonPhrase()
        );

        return ResponseEntity.badRequest().body(fullError);
    }
}
