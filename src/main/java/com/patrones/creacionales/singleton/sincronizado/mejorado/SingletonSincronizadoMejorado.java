package com.patrones.creacionales.singleton.sincronizado.mejorado;

import com.patrones.creacionales.singleton.sincronizado.simple.SingletonSincronizadoSimple;

public class SingletonSincronizadoMejorado {
    // Instancia única de la clase
    private static volatile SingletonSincronizadoMejorado instance;

    // Constructor privado para evitar la instanciación directa
    private SingletonSincronizadoMejorado() {
        System.out.println("Instancia única creada desde SingletonSincronizado.");
    }

    // Método sincronizado para obtener la única instancia
    public static SingletonSincronizadoMejorado getInstance() {
        if (instance == null) {
            synchronized (SingletonSincronizadoSimple.class) {
                if (instance == null) {
                    instance = new SingletonSincronizadoMejorado();
                }
            }
        }
        return instance;
    }

    // Método para simular una operación
    public void doSomething() {
        System.out.println("Hola desde clase singleton sincronizado!");
    }
}
