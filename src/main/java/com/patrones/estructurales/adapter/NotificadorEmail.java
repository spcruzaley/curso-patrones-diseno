package com.patrones.estructurales.adapter;

// Implementación existente
class NotificadorEmail implements Notificador {
    public void enviarMensaje(String mensaje) {
        System.out.println("Enviando correo electrónico: " + mensaje);
    }
}
