package com.fatec.cidade.resources;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fatec.cidade.entities.Cidade;
import com.fatec.cidade.services.CidadeService;

@RestController
@RequestMapping("cidades")
public class CidadeController {

    
    @Autowired
    private CidadeService cidadeService;

    @GetMapping
    public List<Cidade> getCidades(){
        return cidadeService.getCidades();
    }

    @GetMapping({"{id}"})
    public Cidade getCidadeById(@PathVariable int id){
        return cidadeService.getCidadeById(id);
      
    }
    
}
