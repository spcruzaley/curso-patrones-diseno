package com.patrones.creacionales.prototype.personalizada;

// Interfaz que define el método clonar()
interface ClonableItem<T> extends Cloneable {
    T clonar();
}
