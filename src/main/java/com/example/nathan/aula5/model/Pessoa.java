package com.example.nathan.aula5.model;

import jakarta.persistence.*;
import lombok.Generated;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@Entity
@Table
public class Pessoa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String genero;
    private String email;
    private String cpf;
    private LocalDate dataNascimento;
    @OneToMany(mappedBy = "pessoa")
    private List<Telefone> telefones;
}
