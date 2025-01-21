package com.patrones.estructurales.proxy;

import com.patrones.estructurales.proxy.finanzas.FinancialData;
import com.patrones.estructurales.proxy.finanzas.ProtectedFinancialData;
import com.patrones.estructurales.proxy.finanzas.SensitiveFinancialData;
import com.patrones.estructurales.proxy.finanzas.User;

public class Contexto {
    public static void main(String[] args) {
        User user = new User("John Doe");
        user.grantPermission("VIEW_FINANCIAL_REPORT");

        FinancialData financialData = new ProtectedFinancialData(user);
        financialData.displayFinancialReport(); // Mostrará el reporte si el usuario tiene permiso
    }
}
