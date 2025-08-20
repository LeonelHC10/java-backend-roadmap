package com.roadmap.leccion02;

public class Poliza {
    protected String numero;
    protected String asegurado;
    protected double prima;

    public Poliza(String numero, String asegurado, double prima) {
        this.numero = numero;
        this.asegurado = asegurado;
        this.prima = prima;
    }

    public void mostrarDetalle() {
        System.out.println("Póliza N°: " + numero + " | Asegurado: " + asegurado + " | Prima: $" + prima);
    }
}
