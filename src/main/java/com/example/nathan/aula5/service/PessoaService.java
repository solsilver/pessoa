package com.example.nathan.aula5.service;

import com.example.nathan.aula5.model.Pessoa;
import com.example.nathan.aula5.model.Telefone;
import com.example.nathan.aula5.model.dto.PessoaDTO;
import com.example.nathan.aula5.model.dto.TelefoneDTO;
import com.example.nathan.aula5.respository.PessoaRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PessoaService {
    @Autowired
    private PessoaRepository pessoaRepository;
    @Autowired
    private TelefoneService telefoneService;
    @Autowired
    private ModelMapper modelMapper;


    public Pessoa savePessoa(Pessoa pessoaInput) {
        pessoaRepository.save(pessoaInput);
        telefoneService.salvarTelefones(pessoaInput.getTelefones() , pessoaInput);
        return pessoaInput;
    }
    public List<PessoaDTO>getPessoas() {
        List<Pessoa> pessoas = pessoaRepository.findAll();
        List<PessoaDTO> pessoasDTOS = pessoas.stream().map(p -> modelMapper.map(p, PessoaDTO.class)).toList();
       /* for(Pessoa pessoa : pessoas){
            PessoaDTO pessoaDTO = new PessoaDTO();
           pessoaDTO = modelMapper.map(pessoa, PessoaDTO.class);
           pessoasDTOS.add(pessoaDTO);
        }*/
        return pessoasDTOS;


    }

}
