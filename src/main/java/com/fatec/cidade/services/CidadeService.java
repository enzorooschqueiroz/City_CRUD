package com.fatec.cidade.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fatec.cidade.entities.Cidade;
import com.fatec.cidade.repositories.CidadeRepository;

import jakarta.persistence.EntityNotFoundException;

@Service
public class CidadeService {

    @Autowired
    private CidadeRepository cidadeRepository;

    public List<Cidade> getCidades(){
        return cidadeRepository.findAll();
    }

    public Cidade getCidadeById(int id){
        return cidadeRepository.findById(id).orElseThrow(
            () -> new EntityNotFoundException("Cidade não Cadastrada")
        );
    }
    
}
