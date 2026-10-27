package com.MeuPrimeiroSpring.PrimeirosPassos.Service;

import com.MeuPrimeiroSpring.PrimeirosPassos.Pessoas.Controller.Services.PeopleModel;
import com.MeuPrimeiroSpring.PrimeirosPassos.Repository.PeopleRepository;
import org.springframework.stereotype.Service;

@Service
public class PeopleService {

    private final PeopleRepository repository;

    public PeopleService(PeopleRepository repository) {
        this.repository = repository;
    }

    //Salvar pessoa.
    public void savePeople(PeopleModel peopleModel){
        repository.saveAndFlush(peopleModel);
    }

    //Encontrar por email.
    public PeopleModel buscarPorEmail(String email){
        return repository.findByEmail(email).orElseThrow(
                () -> new RuntimeException("Email não encontrado!")
        );
    }

    //Deletar por email.
    public void deletarPorEmail(String email){
        repository.deleteByEmail(email);
    }


}
