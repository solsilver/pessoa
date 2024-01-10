package com.example.nathan.aula5.controller;

import com.example.nathan.aula5.model.Estudante;
import com.example.nathan.aula5.model.Pessoa;
import com.example.nathan.aula5.model.dto.DisciplinasInputDTO;
import com.example.nathan.aula5.model.dto.PessoaDTO;
import com.example.nathan.aula5.service.EstudanteService;
import com.example.nathan.aula5.service.PessoaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("Estudante")
public class EstudanteController {
    @Autowired
    private EstudanteService estudanteService;


    @PostMapping
    public ResponseEntity<?> criarEstudante(@RequestBody Estudante estudante) {
        Estudante estudanteOutput = estudanteService.saveEstudante(estudante);
        URI location = UriComponentsBuilder.fromUriString("http://localhost:8080/Estudante/{id}").
                buildAndExpand(estudanteOutput.getId()).toUri();

        return ResponseEntity.created(location).build();
    }

    @GetMapping
    public ResponseEntity<List<Estudante>> buscarTodos() {
        List<Estudante> estudantes = estudanteService.getAll();
        return ResponseEntity.ok().body(estudantes);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Estudante> addDisciplina(@PathVariable("id") Long id, @RequestBody DisciplinasInputDTO disciplinasInputDTO) {
        Estudante estudante = estudanteService.adicionarDiciplinas(id, disciplinasInputDTO);
        return ResponseEntity.ok().body(estudante);
    }
}
