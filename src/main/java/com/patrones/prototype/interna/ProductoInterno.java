package com.patrones.prototype.interna;

import com.patrones.prototype.ProductoAPIClient;

import java.util.Map;

// Clase Producto que será nuestro prototipo
public class ProductoInterno implements Cloneable {
    private String productoId;
    private String nombre;
    private String descripcion;
    private double precioBase;
    private String moneda;

    // Campos adicionales que podrían variar sin necesitar recargar la info base
    // Por ejemplo: descuento, impuestos, etc.
    private double descuento;    // en porcentaje
    private double impuestos;    // en porcentaje

    // Constructor que obtiene los datos del producto desde el API
    public ProductoInterno(String productoId) {
        this.productoId = productoId;
        cargarDatosDesdeAPI(productoId);
        this.descuento = 0.0;
        this.impuestos = 0.0;
    }

    @Override
    public ProductoInterno clone() {
        try {
            // Llamamos a super.clone() que realiza una clonación superficial
            return (ProductoInterno) super.clone();
        } catch (CloneNotSupportedException e) {
            // Esto no debería suceder ya que implementamos Cloneable
            throw new RuntimeException("No se pudo clonar el objeto", e);
        }
    }

    // Método privado que simula la carga desde el API
    private void cargarDatosDesdeAPI(String productoId) {
        ProductoAPIClient apiClient = new ProductoAPIClient();
        Map<String, Object> datos = apiClient.obtenerDatosProductoDeAPI(productoId);
        this.nombre = (String) datos.get("nombre");
        this.descripcion = (String) datos.get("descripcion");
        this.precioBase = (double) datos.get("precioBase");
        this.moneda = (String) datos.get("moneda");
    }

    // Métodos para configurar descuento e impuestos
    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    public void setImpuestos(double impuestos) {
        this.impuestos = impuestos;
    }

    // Método para calcular el precio final considerando descuento e impuestos
    public double calcularPrecioFinal() {
        double precioConDescuento = precioBase - (precioBase * (descuento / 100.0));
        double precioFinal = precioConDescuento + (precioConDescuento * (impuestos / 100.0));
        return precioFinal;
    }

    // Método para mostrar información del producto
    public void mostrarInfo() {
        System.out.println("=== Información del Producto ===");
        System.out.println("ID: " + productoId);
        System.out.println("Nombre: " + nombre);
        System.out.println("Descripción: " + descripcion);
        System.out.println("Precio Base: " + precioBase + " " + moneda);
        System.out.println("Descuento: " + descuento + "%");
        System.out.println("Impuestos: " + impuestos + "%");
        System.out.println("Precio Final: " + calcularPrecioFinal() + " " + moneda);
        System.out.println("===============================");
    }
}
