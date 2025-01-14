package com.patrones.estructurales.facade;

import com.patrones.estructurales.facade.sistemas.complejos.InventorySystem;
import com.patrones.estructurales.facade.sistemas.complejos.PaymentSystem;
import com.patrones.estructurales.facade.sistemas.complejos.ShippingSystem;

public class OrderFacade {
    private final InventorySystem inventorySystem = new InventorySystem();
    private final PaymentSystem paymentSystem = new PaymentSystem();
    private final ShippingSystem shippingSystem = new ShippingSystem();

    public boolean placeOrder(String productId, int quantity, String cardDetails, double amount, String address) {
        if (!inventorySystem.checkStock(productId, quantity)) {
            System.out.println("Producto no disponible en la cantidad solicitada.");
            return false;
        }
        if (!paymentSystem.processPayment(cardDetails, amount)) {
            System.out.println("El pago no ha sido aprobado.");
            return false;
        }
        shippingSystem.scheduleDelivery(address, productId);
        return true;
    }
}