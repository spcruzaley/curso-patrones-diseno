package com.patrones.estructurales.proxy.finanzas;

public class SensitiveFinancialData implements FinancialData {
    // Constructor con visibilidad de paquete
    SensitiveFinancialData() {}

    @Override
    public void displayFinancialReport() {
        System.out.println("Mostrando reporte financiero detallado.");
    }
}
