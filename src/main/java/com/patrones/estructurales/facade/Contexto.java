package com.patrones.estructurales.facade;

public class Contexto {
    public static void main(String[] args) {
        OrderFacade orderFacade = new OrderFacade();
        if (orderFacade.placeOrder("12345", 1, "4000 1234 5678 9010", 100.00, "Calle 123")) {
            System.out.println("Orden realizada con éxito.");
        } else {
            System.out.println("No se pudo completar la orden.");
        }
    }
}
