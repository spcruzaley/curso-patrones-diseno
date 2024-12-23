package com.patrones.estructurales.adapter;

// Adaptador
class AdaptadorSMS implements Notificador {
    private final ServicioSMS servicioSMS;
    private final String numeroTelefono;

    public AdaptadorSMS(ServicioSMS servicio, String numero) {
        this.servicioSMS = servicio;
        this.numeroTelefono = numero;
    }

    @Override
    public void enviarMensaje(String mensaje) {
        servicioSMS.enviarSMS(numeroTelefono, mensaje);
    }
}
