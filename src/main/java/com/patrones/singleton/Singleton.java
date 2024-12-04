package com.patrones.singleton;

public class Singleton {

    // Instancia única de la clase
    private static Singleton instance;

    // Constructor privado para evitar instanciación externa
    private Singleton() {
        System.out.println("Instancia única creada.");
    }

    // Método público para obtener la instancia
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public void showMessage() {
        System.out.println("Hola desde clase singleton!");
    }
}

