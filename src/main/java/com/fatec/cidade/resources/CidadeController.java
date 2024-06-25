package com.fatec.cidade.resources;


import java.util.ArrayList;
import java.util.List;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fatec.cidade.entities.Cidade;

@RestController
@RequestMapping("cidades")
public class CidadeController {

    
    @GetMapping
    public List<Cidade> getCidades(){

        Cidade c1 = new Cidade();
        c1.setId(1);
        c1.setNome("Itapevi");
        c1.setEstado("Sao Paulo");
        c1.setPop("100000");
        c1.setPib("14");

        Cidade c2 = new Cidade();
        c2.setId(1);
        c2.setNome("Itu");
        c2.setEstado("Sao Paulo");
        c2.setPop("300");
        c2.setPib("12");

        Cidade c3 = new Cidade();
        c3.setId(1);
        c3.setNome("Sao Paulo");
        c3.setEstado("Sao Paulo");
        c3.setPop("1000000");
        c3.setPib("20");


        ArrayList<Cidade> lista = new ArrayList<Cidade>();
        lista.add(c1);
           
        return lista;
    }
    
}
