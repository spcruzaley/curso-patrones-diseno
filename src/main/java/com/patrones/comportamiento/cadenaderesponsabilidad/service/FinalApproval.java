package com.patrones.comportamiento.cadenaderesponsabilidad.service;

import com.patrones.comportamiento.cadenaderesponsabilidad.credit.CreditRequest;

public class FinalApproval extends Handler {

    @Override
    public void handleRequest(CreditRequest request) {
        System.out.println("Aprobación final concedida. Crédito aprobado.");
        if (successor != null) {
            successor.handleRequest(request);
        }
    }
}
