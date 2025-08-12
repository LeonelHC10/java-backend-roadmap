package com.roadmap.leccion01;

public class Persona {
    private String nombre;
    private int edad;
    private String profesion;

    public Persona(String nombre, int edad, String profesion) {
        this.nombre = nombre;
        this.edad = edad;
        this.profesion = profesion;
    }

    public void presentarse() {
        System.out.println("Soy " + nombre + ", " + edad + " años" + profesion + ".");
    }

    public void cumplirAnios() {
        this.edad++;
    }
}
