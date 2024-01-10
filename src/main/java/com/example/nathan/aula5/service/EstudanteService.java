package com.example.nathan.aula5.service;

import com.example.nathan.aula5.controller.EstudanteController;
import com.example.nathan.aula5.model.Disciplina;
import com.example.nathan.aula5.model.Estudante;
import com.example.nathan.aula5.model.Pessoa;
import com.example.nathan.aula5.model.dto.DisciplinasInputDTO;
import com.example.nathan.aula5.respository.EstudateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EstudanteService {
    @Autowired
    private EstudateRepository estudateRepository;
    @Autowired
    private DisciplinaService disciplinaService;

    public  Estudante adicionarDiciplinas(Long id, DisciplinasInputDTO disciplinasid) {
        Estudante estudante =  estudateRepository.findById(id).get();
        List<Disciplina> disciplinas = disciplinaService.buscasDisciplinasbyIds(disciplinasid.getDisciplinasIDs()
                .stream().toList());
        estudante.setDisciplinas(disciplinas);
        return estudateRepository.save(estudante);
    }

    public Estudante saveEstudante(Estudante estudante) {
        estudateRepository.save(estudante);
        //telefoneService.salvarTelefones(pessoaInput.getTelefones() , pessoaInput);
        return estudante;
    }
    public List< Estudante> getAll(){
        List<Estudante> estudantes = estudateRepository.findAll();

    }
}
