package com.example.nathan.aula5.service;

import com.example.nathan.aula5.respository.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PessoaService {
@Autowired
    private PessoaRepository pessoaRepository;
}
