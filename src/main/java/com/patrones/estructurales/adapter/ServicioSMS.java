package com.patrones.estructurales.adapter;

// Servicio de SMS externo
class ServicioSMS {
    public void enviarSMS(String numero, String mensaje) {
        System.out.println("Enviando SMS a " + numero + ": " + mensaje);
    }
}
