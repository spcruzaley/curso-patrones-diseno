package com.patrones.creacionales.builder.manual;

public class CasaBuilder {
    private final int puertas;
    private final int ventanas;
    private final String tipoTecho;
    private final boolean tieneGaraje;

    // Constructor privado para evitar la creación directa
    private CasaBuilder(Builder builder) {
        this.puertas = builder.puertas;
        this.ventanas = builder.ventanas;
        this.tipoTecho = builder.tipoTecho;
        this.tieneGaraje = builder.tieneGaraje;
    }

    // Método estático para acceder al constructor
    public static Builder builder() {
        return new Builder();
    }

    // Métodos getters
    public int getPuertas() {
        return puertas;
    }

    public int getVentanas() {
        return ventanas;
    }

    public String getTipoTecho() {
        return tipoTecho;
    }

    public boolean tieneGaraje() {
        return tieneGaraje;
    }

    // Clase constructora
    public static class Builder {
        private int puertas;
        private int ventanas;
        private String tipoTecho;
        private boolean tieneGaraje;

        // Métodos en cadena para configurar los atributos
        public Builder conPuertas(int puertas) {
            this.puertas = puertas;
            return this;
        }

        public Builder conVentanas(int ventanas) {
            this.ventanas = ventanas;
            return this;
        }

        public Builder conTipoTecho(String tipoTecho) {
            this.tipoTecho = tipoTecho;
            return this;
        }

        public Builder conGaraje(boolean tieneGaraje) {
            this.tieneGaraje = tieneGaraje;
            return this;
        }

        // Método para construir el objeto final
        public CasaBuilder construir() {
            return new CasaBuilder(this);
        }
    }
}
