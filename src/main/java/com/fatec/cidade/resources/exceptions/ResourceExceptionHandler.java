package com.fatec.cidade.resources.exceptions;

import java.time.Instant;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.fatec.cidade.resources.StandarError;

import jakarta.persistence.EntityNotFoundException;
import jakarta.servlet.http.HttpServletRequest;

@ControllerAdvice
public class ResourceExceptionHandler {
    

    @ExceptionHandler(EntityNotFoundException.class)
    public ResponseEntity<StandarError> entityNotFoundException(
        EntityNotFoundException e,
        HttpServletRequest request
    ){
        StandarError error = new StandarError();
        error.setStatus(HttpStatus.NOT_FOUND.value());
        error.setError("Resource not found");
        error.setMessage(e.getMessage());
        error.setTimeStamp(Instant.now());
        error.setPath(request.getRequestURI());



        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(error);
    }
}
