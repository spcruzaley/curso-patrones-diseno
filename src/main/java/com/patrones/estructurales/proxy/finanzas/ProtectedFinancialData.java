package com.patrones.estructurales.proxy.finanzas;

// Clase Proxy
public class ProtectedFinancialData implements FinancialData {
    private final SensitiveFinancialData sensitiveData;
    private final User user;

    public ProtectedFinancialData(User user) {
        this.user = user;
        this.sensitiveData = new SensitiveFinancialData();
    }

    @Override
    public void displayFinancialReport() {
        if (user.hasPermission("VIEW_FINANCIAL_REPORT")) {
            sensitiveData.displayFinancialReport();
            logAccess();
        } else {
            System.out.println("Acceso denegado. No tienes permiso para ver este reporte.");
        }
    }

    private void logAccess() {
        System.out.println("Acceso registrado para el usuario: " + user.getName() + " el " + java.time.LocalDate.now());
    }
}
