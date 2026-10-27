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

    //Atualizar usuário.
    public void atualizarPorId(Long id, PeopleModel peopleModel){
        //Inicializando uma variavel com os dados já inseridos na tabela.
        PeopleModel antigo = repository.findById(id).orElseThrow(()
                -> new RuntimeException("Usuário não encontrado!"));
        //Caso o usuário passe um parametro ele é atualizado, caso ele não passe,
        //o parâmetro antigo se mantem. "?" True?. ":" Se não.
        PeopleModel atualizada = PeopleModel.builder()
                .nome(peopleModel.getNome() != null ?
                        peopleModel.getNome() : antigo.getNome())
                .email(peopleModel.getEmail() != null ?
                        peopleModel.getEmail() : antigo.getEmail())
                .idade(peopleModel.getIdade() != antigo.getIdade()  ?
                        peopleModel.getIdade() : antigo.getIdade())
                .build();

            repository.saveAndFlush(atualizada);
    }

}
