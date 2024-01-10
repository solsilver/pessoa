package com.example.nathan.aula5.respository;

import com.example.nathan.aula5.model.Estudante;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EstudateRepository extends JpaRepository<Estudante, Long> {
}
