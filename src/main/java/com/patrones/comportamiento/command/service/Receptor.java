package com.patrones.comportamiento.command.service;

public class Receptor {
    private final String urlRepository;

    public Receptor(String urlRepository) {
        this.urlRepository = urlRepository;
    }

    public void commit(String message) {
        System.out.println("Commit realizado con mensaje: '" + message + "'");
    }

    public void push() {
        System.out.println("Haciendo push a repositorio " + this.urlRepository);
    }

    public void pull() {
        System.out.println("Cambios del repositorio remoto descargados.");
    }
}
