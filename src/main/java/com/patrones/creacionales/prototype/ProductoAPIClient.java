package com.patrones.creacionales.prototype;

import java.util.HashMap;
import java.util.Map;

// Clase que simula un cliente para obtener datos desde una API externa
// Supongamos que la llamada a esta API es costosa en tiempo de respuesta
public class ProductoAPIClient {
    // Este método simula una llamada a un servicio externo
    // para obtener datos del producto a partir de un ID
    public Map<String, Object> obtenerDatosProductoDeAPI(String productoId) {
        System.out.println("Realizando llamada al API externo para el producto: " + productoId);

        // Supongamos que el API devuelve un mapa con datos del producto
        Map<String, Object> datos = new HashMap<>();
        datos.put("nombre", "Laptop X200");
        datos.put("descripcion", "Laptop con procesador Intel i7, 16GB RAM, SSD 512GB");
        datos.put("precioBase", 1200.00);
        datos.put("moneda", "USD");

        return datos;
    }
}
