package com.example.nathan.aula5.respository;

import com.example.nathan.aula5.model.Disciplina;

import org.springframework.data.jpa.repository.JpaRepository;

public interface DisciplinaRepository extends JpaRepository<Disciplina, Long> {
}
