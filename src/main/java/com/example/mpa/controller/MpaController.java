package com.example.mpa.controller;

import com.example.mpa.beans.Persona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
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
