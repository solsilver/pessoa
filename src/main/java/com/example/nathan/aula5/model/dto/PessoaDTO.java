package com.example.nathan.aula5.model.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class PessoaDTO {
    private Long id;
    private String nome;
    private String genero;
    private String email;
    private String cpf;
    private LocalDate dataNascimento;
    private List<TelefoneDTO > telefones;
}
