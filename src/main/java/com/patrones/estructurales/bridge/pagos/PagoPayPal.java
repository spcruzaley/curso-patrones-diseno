package com.patrones.estructurales.bridge.pagos;

// 2. Implementamos las formas de pago con PayPal
public class PagoPayPal implements MetodoPago {
    @Override
    public void procesarPago(double monto) {
        System.out.println("Procesando pago con PayPal: $" + monto);
    }
}
