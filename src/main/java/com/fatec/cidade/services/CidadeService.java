package com.fatec.cidade.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fatec.cidade.entities.Cidade;
import com.fatec.cidade.repositories.CidadeRepository;

@Service
public class CidadeService {

    @Autowired
    private CidadeRepository cidadeRepository;

    public List<Cidade> getCidades(){
        return cidadeRepository.findAll();
    }
    
}
