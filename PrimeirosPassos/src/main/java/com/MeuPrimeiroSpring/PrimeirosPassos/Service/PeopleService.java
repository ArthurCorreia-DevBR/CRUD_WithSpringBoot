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
}
