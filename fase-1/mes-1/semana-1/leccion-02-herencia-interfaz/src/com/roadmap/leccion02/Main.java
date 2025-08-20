package com.roadmap.leccion02;

public class Main {
    public static void main(String[] args) {
        BeneficiosAdicionales[] polizas = {
            new PolizaVida("VID123", "Juan Pérez", 500.0, 100000.0),
            new PolizaVehicular("VEH456", "Ana Gómez", 300.0, "Todo Riesgo")
        };

        for (BeneficiosAdicionales p : polizas) {
            ((Poliza) p).mostrarDetalle();
            p.mostrarBeneficios();
            System.out.println("-----");
        }
    }
}
