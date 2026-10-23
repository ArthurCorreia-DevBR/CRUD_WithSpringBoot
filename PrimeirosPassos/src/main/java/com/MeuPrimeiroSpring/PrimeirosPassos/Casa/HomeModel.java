package com.MeuPrimeiroSpring.PrimeirosPassos.Casa;


import com.MeuPrimeiroSpring.PrimeirosPassos.Pessoas.Controller.Services.PeopleModel;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "tb_home")
public class HomeModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String rua;
    private int numero;

    @OneToMany(mappedBy = "endereco")
    private List<PeopleModel> moradores;

    //Construtores
    public HomeModel(){}

    public HomeModel(String rua, int numero, List<PeopleModel> moradores){
        this.rua = rua;
        this.numero = numero;
        this.moradores = moradores;
    }

    //Setters
    public void setRua(String rua){
        this.rua = rua;
    }

    public void setNumero(int numero){
        this.numero = numero;
    }

    public void setMoradores(List<PeopleModel> moradores){
        this.moradores = moradores;
    }

    //Getters
    public String getRua(){
        return this.rua;
    }

    public int getNumero(){
        return this.numero;
    }

    public List<PeopleModel> getMoradores(){
        return this.moradores;
    }


}
