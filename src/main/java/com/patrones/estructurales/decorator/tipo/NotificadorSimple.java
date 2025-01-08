package com.patrones.estructurales.decorator.tipo;

import com.patrones.estructurales.decorator.base.Notificador;

public class NotificadorSimple implements Notificador {
    @Override
    public void enviar(String mensaje) {
        System.out.println("Notificación básica: " + mensaje);
    }
}
