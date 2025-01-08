package com.patrones.estructurales.bridge.plataformas;

import com.patrones.estructurales.bridge.pagos.MetodoPago;

public class PlataformaMovil extends Plataforma {
    public PlataformaMovil(MetodoPago metodoPago) {
        super(metodoPago);
    }

    @Override
    public void realizarPago(double monto) {
        System.out.println("Iniciando pago desde la aplicación móvil...");
        metodoPago.procesarPago(monto);  // Llamamos al método de pago correspondiente
    }
}
