package com.fatec.cidade.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fatec.cidade.entities.Cidade;

public interface CidadeRepository extends JpaRepository<Cidade,Integer> {
    
}
