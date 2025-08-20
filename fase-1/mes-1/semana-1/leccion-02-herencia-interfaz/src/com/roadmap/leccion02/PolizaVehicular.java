package com.roadmap.leccion02;

public class PolizaVehicular extends Poliza implements BeneficiosAdicionales {
    private String tipoCoberturaVehiculo;

    public PolizaVehicular(String numero, String asegurado, double prima, String tipoCoberturaVehiculo) {
        super(numero, asegurado, prima);
        this.tipoCoberturaVehiculo = tipoCoberturaVehiculo;
    }

    @Override
    public void mostrarBeneficios() {
        System.out.println("Cobertura vehicular: " + tipoCoberturaVehiculo);
    }
}
