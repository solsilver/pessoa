package com.example.nathan.aula5.respository;

import com.example.nathan.aula5.model.Telefone;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TelefoneRepository extends JpaRepository<Telefone , Long> {
}
