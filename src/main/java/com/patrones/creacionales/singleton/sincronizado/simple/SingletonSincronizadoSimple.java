package com.patrones.creacionales.singleton.sincronizado.simple;

public class SingletonSincronizadoSimple {
    // Instancia única de la clase
    private static SingletonSincronizadoSimple instance;

    // Constructor privado para evitar la instanciación directa
    private SingletonSincronizadoSimple() {
        System.out.println("Instancia única creada desde SingletonSincronizadoSimple.");
    }

    // Método sincronizado para obtener la única instancia
    public static synchronized SingletonSincronizadoSimple getInstance() {
        if (instance == null) {
            instance = new SingletonSincronizadoSimple();
        }
        return instance;
    }

    // Método para simular una operación
    public void doSomething() {
        System.out.println("Hola desde clase singleton sincronizado!");
    }
}
