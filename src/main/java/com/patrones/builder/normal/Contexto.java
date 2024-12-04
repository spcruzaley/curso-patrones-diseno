package com.patrones.builder.normal;

public class Contexto {
    public static void main(String[] args) {
        // Crear una instancia de Casa pasando los valores directamente en el constructor
        Casa casa = new Casa(1, 2, "normal", false);

        // Imprimir los detalles de la casa
        System.out.println("Detalles de la casa:");
        System.out.println("Puertas: " + casa.getPuertas());
        System.out.println("Ventanas: " + casa.getVentanas());
        System.out.println("Tipo de Techo: " + casa.getTipoTecho());
        System.out.println("¿Tiene Garaje?: " + casa.tieneGaraje());

        // Crear una instancia de Casa y asignamos los valores por medio de los "setters"
        Casa casa2 = new Casa();
        casa2.setPuertas(2);
        casa2.setVentanas(4);
        casa2.setTipoTecho("Lamina");
        casa2.setTieneGaraje(true);

        // Imprimir los detalles de la casa
        System.out.println("Detalles de la casa:");
        System.out.println("Puertas: " + casa2.getPuertas());
        System.out.println("Ventanas: " + casa2.getVentanas());
        System.out.println("Tipo de Techo: " + casa2.getTipoTecho());
        System.out.println("¿Tiene Garaje?: " + casa2.tieneGaraje());
    }
}
