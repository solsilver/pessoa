package com.example.nathan.aula5.service;

import com.example.nathan.aula5.model.Pessoa;
import com.example.nathan.aula5.model.Telefone;
import com.example.nathan.aula5.respository.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PessoaService {
    @Autowired
    private PessoaRepository pessoaRepository;
    @Autowired
    private TelefoneService telefoneService;



    public Pessoa savePessoa(Pessoa pessoaInput) {
        pessoaRepository.save(pessoaInput);
        telefoneService.salvarTelefones(pessoaInput.getTelefones() , pessoaInput);
        return pessoaInput;
    }
    public List<Pessoa> getPessoas() {

        return pessoaRepository.findAll();


    }

}
