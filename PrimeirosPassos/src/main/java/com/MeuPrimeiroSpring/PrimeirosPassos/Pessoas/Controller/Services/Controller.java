package com.MeuPrimeiroSpring.PrimeirosPassos.Pessoas.Controller.Services;

import com.MeuPrimeiroSpring.PrimeirosPassos.Service.PeopleService;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/People")
@RequiredArgsConstructor
public class Controller {

    private final PeopleService peopleService;

    //ResponseEntity para retornar da forma padrão, com os verbos http: 200, 400, etc.
    //Como este é um CRUD para aprendizado, todas requisições retornam ok.

    //Buscar uma pessoa.
    //RequestParam para receber o email da requisição http.
    @GetMapping
    public ResponseEntity<PeopleModel> buscarPorEmail(@RequestParam String email){
        return ResponseEntity.ok(peopleService.buscarPorEmail(email));
    }

    //Cadastrar uma pessoa.
    //RequestBody para receber os parametros do corpo da requisição http.
    @PostMapping
    public ResponseEntity<Void> cadastrarPessoa(@RequestBody PeopleModel infos){
        peopleService.savePeople(infos);
        return ResponseEntity.ok().build();
    }

    //Deletar cadastro.
    //RequestParam para receber o email da requisição http.
    @DeleteMapping
    public ResponseEntity<Void> deletarPorEmail(@RequestParam String email){
        peopleService.deletarPorEmail(email);
        return ResponseEntity.ok().build();
    }

    //Atualizar cadastro.
    //Juntamos os RequestParam para receber o ID, e o @RequestBody para receber todos os dados do corpo da requisição.
    //O RequestParam serve neste caso para termos o ID de forma mais precisa dentro da requisição.
    @PutMapping
    public ResponseEntity<Void> atualizarPorId(@RequestParam Long id,
                                               @RequestBody PeopleModel newdata){
        peopleService.atualizarPorId(id, newdata);
        return ResponseEntity.ok().build();
    }
}
