package com.patrones.creacionales.builder.normal;

public class Casa {
    private int puertas;
    private int ventanas;
    private String tipoTecho;
    private boolean tieneGaraje;

    public Casa() {
    }

    public Casa(int puertas, int ventanas, String tipoTecho, boolean tieneGaraje) {
        this.puertas = puertas;
        this.ventanas = ventanas;
        this.tipoTecho = tipoTecho;
        this.tieneGaraje = tieneGaraje;
    }

    public int getPuertas() {
        return puertas;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }

    public int getVentanas() {
        return ventanas;
    }

    public void setVentanas(int ventanas) {
        this.ventanas = ventanas;
    }

    public String getTipoTecho() {
        return tipoTecho;
    }

    public void setTipoTecho(String tipoTecho) {
        this.tipoTecho = tipoTecho;
    }

    public boolean tieneGaraje() {
        return tieneGaraje;
    }

    public void setTieneGaraje(boolean tieneGaraje) {
        this.tieneGaraje = tieneGaraje;
    }
}
