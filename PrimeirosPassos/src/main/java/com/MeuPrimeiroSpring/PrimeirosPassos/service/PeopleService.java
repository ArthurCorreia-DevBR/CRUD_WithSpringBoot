package com.MeuPrimeiroSpring.PrimeirosPassos.service;

import com.MeuPrimeiroSpring.PrimeirosPassos.entity.PeopleModel;
import com.MeuPrimeiroSpring.PrimeirosPassos.excepetion.error.DoubleEmail;
import com.MeuPrimeiroSpring.PrimeirosPassos.excepetion.error.MandatoryArguments;
import com.MeuPrimeiroSpring.PrimeirosPassos.excepetion.error.UserNotFond;
import com.MeuPrimeiroSpring.PrimeirosPassos.repository.PeopleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PeopleService {

    //Injeção de dependencia
    private final PeopleRepository repository;

    //Salvar pessoa.
    public void savePeople(PeopleModel peopleModel){

        if (repository.existsByEmail(peopleModel.getEmail()))
            throw new DoubleEmail("Este email já foi cadastrado");

        if (peopleModel.getEmail() == null || peopleModel.getEmail().isBlank())
            throw new MandatoryArguments("O campo email é obrigatório");

        if (peopleModel.getNome() == null || peopleModel.getNome().isBlank())
            throw new MandatoryArguments("O campo nome é obrigatório");

        if (peopleModel.getIdade() != null)
            if (peopleModel.getIdade() < 0)
                throw new MandatoryArguments("A idade deve ser maior ou igual a zero");

        repository.saveAndFlush(peopleModel);
    }

    //Encontrar por email.
    public PeopleModel buscarPorEmail(String email){
        //Caso não encontre um email, lança uma exceção. "OrElseThrow"
        return repository.findByEmail(email).orElseThrow(
                () -> new UserNotFond ("Email não encontrado!")
        );
    }

    //Deletar por email.
    public void deletarPorEmail(String email){
        if (!repository.existsByEmail(email))
            throw new UserNotFond("Email não encontrado");

        repository.deleteByEmail(email);
    }

    //Atualizar usuário.
    public void atualizarPorId(Long id, PeopleModel peopleModel){
        //Inicializando uma variavel com os dados já inseridos na tabela.
        PeopleModel antigo = repository.findById(id).orElseThrow(()
                -> new UserNotFond("Usuário não encontrado!"));
        //Caso o usuário passe um parametro ele é atualizado, caso ele não passe,
        //o parâmetro antigo se mantem. "?" True?. ":" Se não.
        PeopleModel atualizada = PeopleModel.builder()
                .id(antigo.getId())
                .nome(peopleModel.getNome() != null ?
                        peopleModel.getNome() : antigo.getNome())
                .email(peopleModel.getEmail() != null ?
                        peopleModel.getEmail() : antigo.getEmail())
                .idade(peopleModel.getIdade() != null ?
                        peopleModel.getIdade() : antigo.getIdade())
                .build();

            repository.saveAndFlush(atualizada);
    }

    //Listar todos
    public List<PeopleModel> listarTodos(){
        return repository.findAll();
    }
}
