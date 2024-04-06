package com.example.mpa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.mpa.beans.Persona;

@RestController
public class MpaController {
    @Autowired
    Persona per;

    @GetMapping(value = "/prueba")
    public String getMessage(){
        String responde   = "¡Hola!";

        String name = per.getName();
        System.out.println(name);
        return responde;
    }

}
