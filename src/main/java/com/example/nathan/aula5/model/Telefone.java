package com.example.nathan.aula5.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Telefone {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    private Integer ddd;

    private String numero;
    @ManyToOne
    @JoinColumn(name =  "pessoa_id")
    private Pessoa pessoa;

}
