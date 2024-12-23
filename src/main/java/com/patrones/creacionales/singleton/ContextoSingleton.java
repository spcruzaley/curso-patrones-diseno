package com.patrones.creacionales.singleton;

public class ContextoSingleton {
    public static void main(String[] args) {
        // Obtener la única instancia del Singleton
        Singleton singleton1 = Singleton.getInstance();
        singleton1.showMessage();

        // Intentar obtener otra instancia
        Singleton singleton2 = Singleton.getInstance();
        singleton2.showMessage();

        // Comparar las instancias
        System.out.println("Son iguales? " + (singleton1 == singleton2));
        System.out.println(singleton1.hashCode());
        System.out.println(singleton2.hashCode());
    }
}
