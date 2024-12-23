package com.patrones.estructurales.adapter;

// Demostración
public class Contexto {
    public static void main(String[] args) {
        Notificador notificadorEmail = new NotificadorEmail();
        notificadorEmail.enviarMensaje("Bienvenido al curso de Patrones de Diseño!");

        ServicioSMS servicioSMS = new ServicioSMS();
        Notificador notificadorSMS = new AdaptadorSMS(servicioSMS, "555-1234");
        notificadorSMS.enviarMensaje("Tu suscripción ha sido activada.");
    }
}
