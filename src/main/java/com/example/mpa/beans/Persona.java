package com.example.mpa.beans;


public class Persona {


    private String name;

    public void setName(String name) {
        this.name = name;
    }

    private Integer edad;

    public String getName() {
        return name;
    }

    public Persona(String name, Integer edad) {
        this.name = name;
        this.edad = edad;
    }

    public Persona() {
    }
}
