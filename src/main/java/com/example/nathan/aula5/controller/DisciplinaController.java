package com.example.nathan.aula5.controller;

import com.example.nathan.aula5.model.Disciplina;
import com.example.nathan.aula5.model.Estudante;
import com.example.nathan.aula5.respository.DisciplinaRepository;
import com.example.nathan.aula5.service.DisciplinaService;
import com.example.nathan.aula5.service.EstudanteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
@RestController
@RequestMapping("Disciplina")
public class DisciplinaController {
    @Autowired
    private DisciplinaService disciplinaService;


    @PostMapping
    public ResponseEntity<?> criarDisciplina(@RequestBody Disciplina disciplina) {
        Disciplina disciplinaOutput = disciplinaService.saveDisciplina(disciplina);
        URI location = UriComponentsBuilder.fromUriString("http://localhost:8080/Pessoa/{id}").
                buildAndExpand(disciplinaOutput.getId()).toUri();

        return ResponseEntity.created(location).build();
    }
}
