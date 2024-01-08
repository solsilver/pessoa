package com.example.nathan.aula5.service;

import com.example.nathan.aula5.model.Pessoa;
import com.example.nathan.aula5.model.Telefone;
import com.example.nathan.aula5.respository.TelefoneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TelefoneService {
    @Autowired
    private TelefoneRepository telefoneRepository;
    public Telefone salvarTelefones(List<Telefone> telefones , Pessoa pessoa){
        telefones.stream().forEach(t -> t.setPessoa(pessoa));
        telefoneRepository.saveAll(telefones);
        return new Telefone();

    }
}
