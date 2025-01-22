package com.patrones.comportamiento.cadenaderesponsabilidad.credit;

// Clase para representar la solicitud de crédito
public class CreditRequest {
    private final boolean allDocuments;
    private final int creditScore;

    public CreditRequest(boolean allDocuments, int creditScore) {
        this.allDocuments = allDocuments;
        this.creditScore = creditScore;
    }

    public boolean hasAllDocuments() {
        return allDocuments;
    }

    public int getCreditScore() {
        return creditScore;
    }
}
