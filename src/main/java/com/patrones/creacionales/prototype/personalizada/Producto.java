package com.patrones.creacionales.prototype.personalizada;

import com.patrones.creacionales.prototype.ProductoAPIClient;
import com.patrones.creacionales.prototype.Vendedor;

import java.util.Map;

// Clase Producto que será nuestro prototipo
public class Producto implements ClonableItem<Producto> {
    private String productoId;
    private String nombre;
    private String descripcion;
    private double precioBase;
    private String moneda;
    private Vendedor vendedor;

    // Campos adicionales que podrían variar sin necesitar recargar la info base
    // Por ejemplo: descuento, impuestos, etc.
    private double descuento;    // en porcentaje
    private double impuestos;    // en porcentaje

    // Constructor que obtiene los datos del producto desde el API
    public Producto(String productoId) {
        this.productoId = productoId;
        cargarDatosDesdeAPI(productoId);
        this.descuento = 0.0;
        this.impuestos = 0.0;
        this.vendedor = new Vendedor("Generico", "China");
    }

    // Constructor de copia (para el clon)
    public Producto(Producto otro) {
        this.productoId = otro.productoId;
        this.nombre = otro.nombre;
        this.descripcion = otro.descripcion;
        this.precioBase = otro.precioBase;
        this.moneda = otro.moneda;
        this.descuento = otro.descuento;
        this.impuestos = otro.impuestos;
        this.vendedor = otro.vendedor;
    }

    // Método para clonar el producto
    @Override
    public Producto clonar() {
        return new Producto(this);
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

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
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
        System.out.println("Vendedor: " + vendedor);
        System.out.println("===============================");
    }
}

