package com.patrones.builder.manual;

public class ContextoBuilder {
    public static void main(String[] args) {
        // Crear una casa utilizando el patrón Builder
        CasaBuilder casa = CasaBuilder.builder()
                .conPuertas(4)
                .conVentanas(8)
                .conTipoTecho("A dos aguas")
                .conGaraje(true)
                .construir();

        // Imprimir los detalles de la casa
        System.out.println("Detalles de la casa:");
        System.out.println("Puertas: " + casa.getPuertas());
        System.out.println("Ventanas: " + casa.getVentanas());
        System.out.println("Tipo de Techo: " + casa.getTipoTecho());
        System.out.println("¿Tiene Garaje?: " + casa.tieneGaraje());
    }
}

