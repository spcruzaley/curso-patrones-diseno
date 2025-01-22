package com.patrones.comportamiento.cadenaderesponsabilidad.service;

import com.patrones.comportamiento.cadenaderesponsabilidad.credit.CreditRequest;

public abstract class Handler {
    protected Handler successor;

    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }

    public abstract void handleRequest(CreditRequest request);
}
