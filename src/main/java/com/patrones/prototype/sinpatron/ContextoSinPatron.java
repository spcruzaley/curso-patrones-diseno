package com.patrones.prototype.sinpatron;

public class ContextoSinPatron {

    public static void main(String[] args) {
        // Creamos un producto original a partir de la API (costoso)
        ProductoSinPatron productoOriginal = new ProductoSinPatron("P001");
        productoOriginal.setDescuento(10);
        productoOriginal.setImpuestos(15);
        productoOriginal.mostrarInfo();
    }
}
