package com.MeuPrimeiroSpring.PrimeirosPassos;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_cadastros")
public class PeopleModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;
    String nome;
    String email;
    int idade;

    //Contrutores
    public PeopleModel(){}

    public PeopleModel(String nome, String email, int idade){
        this.nome = nome;
        this.email = email;
        this.idade = idade;
    }

    //Getters
    public void setNome(String nome){
        this.nome = nome;
    }

    public void setIdade(int idade){
        this.idade=idade;
    }

    public void setEmail(String email){
        this.email=email;
    }

    //Setters
    public String getNome(){
        return this.nome;
    }

    public String getEmail(){
        return this.email;
    }

    public int getIdade(){
        return this.idade;
    }

}
