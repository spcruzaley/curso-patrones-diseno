package com.patrones.estructurales.bridge.pagos;

// 2. Implementamos las formas de pago con TC
public class PagoTarjetaCredito implements MetodoPago {
    @Override
    public void procesarPago(double monto) {
        System.out.println("Procesando pago con tarjeta de crédito: $" + monto);
    }
}
