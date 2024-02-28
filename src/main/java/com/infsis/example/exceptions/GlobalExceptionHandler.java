package com.infsis.example.exceptions;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.HashMap;
import java.util.Map;

@ControllerAdvice
public class GlobalExceptionHandler extends RuntimeException{

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<Response> handlerException(MethodArgumentNotValidException ex){
        Map<String,String> errors=new HashMap<>();

        ex.getBindingResult().getAllErrors().forEach(error-> {
                errors.put(error.getObjectName(),error.getDefaultMessage());
            }
        );

        return ResponseEntity.badRequest().body(new Response("Argumentos invalidos",errors));
    }
}
