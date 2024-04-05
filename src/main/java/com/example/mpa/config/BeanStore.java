package com.example.mpa.config;

import com.example.mpa.beans.Persona;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanStore {
    @Bean
    public Persona addPerson(){
       return new Persona("Juan", 55);
    }



}
