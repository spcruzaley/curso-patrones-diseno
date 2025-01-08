package com.patrones.estructurales.bridge.plataformas;

import com.patrones.estructurales.bridge.pagos.MetodoPago;

// 3. Creamos una clase abstracta para definir la plataforma desde donde se realiza el pago
public abstract class Plataforma {
    protected MetodoPago metodoPago;  // Aquí guardamos la forma de pago

    public Plataforma(MetodoPago metodoPago) {
        this.metodoPago = metodoPago;  // Asignamos el método de pago
    }

    public abstract void realizarPago(double monto);  // Método para hacer el pago
}
