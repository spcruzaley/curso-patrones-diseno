package com.patrones.estructurales.decorator.tipo;

import com.patrones.estructurales.decorator.base.Notificador;
import com.patrones.estructurales.decorator.base.NotificadorDecorador;

public class NotificadorEmail extends NotificadorDecorador {
    public NotificadorEmail(Notificador notificador) {
        super(notificador);
    }

    @Override
    public void enviar(String mensaje) {
        super.enviar(mensaje);
        enviarEmail(mensaje);
    }

    private void enviarEmail(String mensaje) {
        System.out.println("Enviar email: " + mensaje);
    }
}
