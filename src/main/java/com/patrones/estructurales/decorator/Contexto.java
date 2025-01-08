package com.patrones.estructurales.decorator;

import com.patrones.estructurales.decorator.base.Notificador;
import com.patrones.estructurales.decorator.tipo.NotificadorEmail;
import com.patrones.estructurales.decorator.tipo.NotificadorSMS;
import com.patrones.estructurales.decorator.tipo.NotificadorSimple;

public class Contexto {
    public static void main(String[] args) {
        Notificador notificador = new NotificadorSimple();
        Notificador notificadorConEmail = new NotificadorEmail(notificador);
        Notificador notificadorConSMS = new NotificadorSMS(notificadorConEmail);
        notificadorConSMS.enviar("Tu pedido ha sido enviado");
    }
}
