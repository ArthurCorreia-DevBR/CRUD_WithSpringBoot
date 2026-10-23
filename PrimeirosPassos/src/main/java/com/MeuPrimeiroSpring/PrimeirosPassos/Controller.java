package com.MeuPrimeiroSpring.PrimeirosPassos;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class Controller {

    @GetMapping("/saudacao")
    public String saudacao(){
        return "Olá, mundo!";
    }

}
