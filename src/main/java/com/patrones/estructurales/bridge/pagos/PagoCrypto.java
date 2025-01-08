package com.patrones.estructurales.bridge.pagos;

// 2. Implementamos las formas de pago con TC
public class PagoCrypto implements MetodoPago {
    @Override
    public void procesarPago(double monto) {
        // logica para convertir double en string
        System.out.println("Procesando pago con BTC: " + monto);
    }
}
