package com.patrones.singleton.sincronizado.simple;

public class ContextoSingletonSincronizadoSimple {
    public static void main(String[] args) {
        // Crear múltiples hilos para probar la sincronización
        Runnable task = () -> {
            SingletonSincronizadoSimple singleton = SingletonSincronizadoSimple.getInstance();
            System.out.println("hashCode de la instancia: " + singleton.hashCode() + " - " + Thread.currentThread().getName());
        };

        // Crear y ejecutar 5 hilos
        Thread thread1 = new Thread(task, "thread 1");
        Thread thread2 = new Thread(task, "thread 2");
        Thread thread3 = new Thread(task, "thread 3");
        Thread thread4 = new Thread(task, "thread 4");
        Thread thread5 = new Thread(task, "thread 5");

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();
    }
}

