package com.patrones.estructurales.bridge.pagos;

// 1. Definimos una interfaz con el "cómo" se realizará el pago
public interface MetodoPago {
    void procesarPago(double monto);  // Esto será lo que hace cada método de pago
}
