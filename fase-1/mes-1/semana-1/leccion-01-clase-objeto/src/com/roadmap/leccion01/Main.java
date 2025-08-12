package com.roadmap.leccion01;

public class Main {
    public static void main(String[] args) {
        Persona p1 = new Persona("Carlos", 30, "Desarrollador");
        Persona p2 = new Persona("Jose", 45, "Administrador");

        p1.presentarse();
        p2.presentarse();

        p1.cumplirAnios();
        p1.presentarse();
    }
}
