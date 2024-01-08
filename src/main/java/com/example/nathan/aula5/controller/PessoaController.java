package com.example.nathan.aula5.controller;

import com.example.nathan.aula5.model.Pessoa;
import com.example.nathan.aula5.service.PessoaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("Pessoa")
public class PessoaController {
    @Autowired
    private PessoaService pessoaService;

    @GetMapping
    public ResponseEntity<List<Pessoa>> buscarPessoas() {

        List<Pessoa> pessoas = pessoaService.getPessoas();
        return ResponseEntity.ok().body(pessoas);

    }
    @PostMapping
    public ResponseEntity<?> criarPessoa(@RequestBody Pessoa pessoaInput) {
        Pessoa pessoaOutput = pessoaService.savePessoa(pessoaInput);
        URI location = UriComponentsBuilder.fromUriString("http://localhost:8080/Pessoa/{id}").
                buildAndExpand(pessoaOutput.getId()).toUri();

        return ResponseEntity.created(location).build();
    }

}


