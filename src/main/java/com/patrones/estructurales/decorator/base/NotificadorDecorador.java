package com.patrones.estructurales.decorator.base;

public abstract class NotificadorDecorador implements Notificador {
    protected Notificador notificadorDecorado;

    public NotificadorDecorador(Notificador notificador) {
        this.notificadorDecorado = notificador;
    }

    public void enviar(String mensaje) {
        notificadorDecorado.enviar(mensaje);
    }
}
