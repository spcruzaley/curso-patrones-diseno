package com.patrones.estructurales.decorator.tipo;

import com.patrones.estructurales.decorator.base.Notificador;
import com.patrones.estructurales.decorator.base.NotificadorDecorador;

public class NotificadorSMS extends NotificadorDecorador {
    public NotificadorSMS(Notificador notificador) {
        super(notificador);
    }

    @Override
    public void enviar(String mensaje) {
        super.enviar(mensaje);
        enviarSMS(mensaje);
    }

    private void enviarSMS(String mensaje) {
        System.out.println("Enviar SMS: " + mensaje);
    }
}