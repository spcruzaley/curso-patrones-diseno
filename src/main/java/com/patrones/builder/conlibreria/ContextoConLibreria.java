package com.patrones.builder.conlibreria;

public class ContextoConLibreria {

    public static void main(String[] args) {
        // Crear una casa utilizando el patrón Builder
        CasaConLibreria casa = CasaConLibreria.builder()
                .puertas(4)
                .ventanas(8)
                .tipoTecho("A dos aguas")
                .tieneGaraje(true)
                .build();

        // Imprimir los detalles de la casa
        System.out.println("Detalles de la casa:");
        System.out.println("Puertas: " + casa.getPuertas());
        System.out.println("Ventanas: " + casa.getVentanas());
        System.out.println("Tipo de Techo: " + casa.getTipoTecho());
        System.out.println("¿Tiene Garaje?: " + casa.isTieneGaraje());
    }
}
