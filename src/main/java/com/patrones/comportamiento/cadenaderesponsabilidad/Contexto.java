package com.patrones.comportamiento.cadenaderesponsabilidad;

import com.patrones.comportamiento.cadenaderesponsabilidad.credit.CreditRequest;
import com.patrones.comportamiento.cadenaderesponsabilidad.service.CreditScoreChecker;
import com.patrones.comportamiento.cadenaderesponsabilidad.service.DocumentValidator;
import com.patrones.comportamiento.cadenaderesponsabilidad.service.FinalApproval;
import com.patrones.comportamiento.cadenaderesponsabilidad.service.Handler;

public class Contexto {
    public static void main(String[] args) {
        Handler documentValidator = new DocumentValidator();
        Handler creditScoreChecker = new CreditScoreChecker();
        Handler finalApproval = new FinalApproval();

        documentValidator.setSuccessor(creditScoreChecker);
        creditScoreChecker.setSuccessor(finalApproval);

        CreditRequest request = new CreditRequest(true, 700);
        documentValidator.handleRequest(request);
    }
}
