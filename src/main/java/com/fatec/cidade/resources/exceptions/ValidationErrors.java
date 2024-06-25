package com.fatec.cidade.resources.exceptions;

import java.util.ArrayList;
import java.util.List;

import com.fatec.cidade.resources.StandarError;

public class ValidationErrors extends StandarError{

    private List<String> errors = new ArrayList<>();

    public void addError(String error){
        this.errors.add(error);

    }

    public List<String> getErrors(){
        return this.errors;
    }
    
}
