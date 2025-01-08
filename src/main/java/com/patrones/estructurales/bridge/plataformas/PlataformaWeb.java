package com.patrones.estructurales.bridge.plataformas;

import com.patrones.estructurales.bridge.pagos.MetodoPago;

// 4. Implementamos las diferentes plataformas (web y móvil)
public class PlataformaWeb extends Plataforma {
    public PlataformaWeb(MetodoPago metodoPago) {
        super(metodoPago);
    }

    @Override
    public void realizarPago(double monto) {
        System.out.println("Iniciando pago desde la plataforma web...");
        metodoPago.procesarPago(monto);  // Llamamos al método de pago correspondiente
    }
}
