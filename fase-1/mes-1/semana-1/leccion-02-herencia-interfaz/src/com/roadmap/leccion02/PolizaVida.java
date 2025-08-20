package com.roadmap.leccion02;

public class PolizaVida extends Poliza implements BeneficiosAdicionales {
    private double coberturaVida;

    public PolizaVida(String numero, String asegurado, double prima, double coberturaVida) {
        super(numero, asegurado, prima);
        this.coberturaVida = coberturaVida;
    }

    @Override
    public void mostrarBeneficios() {
        System.out.println("Cobertura de vida: $" + coberturaVida);
    }
}
