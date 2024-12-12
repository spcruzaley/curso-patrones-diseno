package com.patrones.prototype.personalizada;

public class ContextoPrototypePropio {

    public static void main(String[] args) {
        // Creamos un producto original a partir de la API (costoso)
        Producto productoOriginal = new Producto("P001");
        productoOriginal.setDescuento(15);
        productoOriginal.setImpuestos(16);
        productoOriginal.mostrarInfo(); // Muestra la info original

        // Ahora queremos crear una variante del mismo producto, con un descuento especial
        // en lugar de volver a llamar al API, clonamos el producto.
        Producto productoVariacion = productoOriginal.clonar();
        // Cambiamos solo los parámetros que necesitamos (por ejemplo, un 10% de descuento y 8% de impuestos)
        productoVariacion.setDescuento(10);
        productoVariacion.setImpuestos(8);

        productoOriginal.getVendedor().setNombre("Fulanito");
        productoOriginal.getVendedor().setPais("México");

        // Mostramos la info del producto variado
        productoVariacion.mostrarInfo();

        // Así, el segundo producto mantiene todos los datos obtenidos de la API, sin hacer una nueva llamada.
        // Solo hemos ajustado lo necesario. Si quisiéramos otra variación (otro descuento, otra moneda, etc.),
        // bastaría con clonar nuevamente sin coste de acceso a la API.
    }
}
