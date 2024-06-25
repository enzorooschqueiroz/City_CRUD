package com.fatec.cidade.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record CidadeRequest(
   
    @NotNull(message = "Nome não pode ser nulo")
    String nome,  
   
    @NotNull(message = "Nome não pode ser nulo")
    String estado, 
   
    @NotBlank(message = "Nome não pode ser nulo")
    String pop, 
   
    @NotBlank(message = "Nome não pode ser nulo")
    String pib 
    

){


    
}
