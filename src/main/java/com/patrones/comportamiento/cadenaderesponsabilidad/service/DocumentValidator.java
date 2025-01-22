package com.patrones.comportamiento.cadenaderesponsabilidad.service;

import com.patrones.comportamiento.cadenaderesponsabilidad.credit.CreditRequest;

public class DocumentValidator extends Handler {

    @Override
    public void handleRequest(CreditRequest request) {
        if (request.hasAllDocuments()) {
            System.out.println("Todos los documentos están presentes. Pasando al siguiente.");
            if (successor != null) {
                successor.handleRequest(request);
            }
        } else {
            System.out.println("Faltan documentos. Solicitud de crédito rechazada.");
        }
    }
}
