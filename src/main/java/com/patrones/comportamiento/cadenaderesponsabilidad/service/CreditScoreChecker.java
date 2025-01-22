package com.patrones.comportamiento.cadenaderesponsabilidad.service;

import com.patrones.comportamiento.cadenaderesponsabilidad.credit.CreditRequest;

public class CreditScoreChecker extends Handler {

    @Override
    public void handleRequest(CreditRequest request) {
        if (request.getCreditScore() >= 650) {
            System.out.println("Puntaje de crédito aceptable. Pasando al siguiente.");
            if (successor != null) {
                successor.handleRequest(request);
            }
        } else {
            System.out.println("Puntaje de crédito insuficiente. Solicitud de crédito rechazada.");
        }
    }
}
