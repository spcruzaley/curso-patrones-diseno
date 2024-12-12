package com.patrones.prototype;

public class Vendedor {
    private String nombre;
    private String pais;

    public Vendedor() {
    }

    public Vendedor(String nombre, String pais) {
        this.nombre = nombre;
        this.pais = pais;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    @Override
    public String toString() {
        return nombre + " - " + pais;
    }
}
