package com.patrones.estructurales.facade.sistemas.complejos;

public class PaymentSystem {
    public boolean processPayment(String cardDetails, double amount) {
        // Lógica para procesar el pago
        System.out.println("El pago ha sido completado exitosamente");
        return true; // Simulando un pago exitoso
    }
}
