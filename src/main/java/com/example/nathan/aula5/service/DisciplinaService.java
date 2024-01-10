package com.example.nathan.aula5.service;

import com.example.nathan.aula5.model.Disciplina;
import com.example.nathan.aula5.model.Estudante;
import com.example.nathan.aula5.respository.DisciplinaRepository;
import com.example.nathan.aula5.respository.EstudateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DisciplinaService {
    @Autowired
    private DisciplinaRepository disciplinaRepository;
    public Disciplina saveDisciplina(Disciplina disciplina) {
        disciplinaRepository.save(disciplina);
        //telefoneService.salvarTelefones(pessoaInput.getTelefones() , pessoaInput);
        return disciplina;
    }

    public List<Disciplina> buscasDisciplinasbyIds(List<Long> disciplinasid) {
        return disciplinaRepository.findAllById(disciplinasid);
    }

    public void vinculaEstudante(List<Disciplina> disciplinas, Estudante estudante) {
        for( Disciplina disciplina : disciplinas){
            disciplina.addEstudante(estudante);
        }
            disciplinaRepository.saveAll(disciplinas);
    }
}
