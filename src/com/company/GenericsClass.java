package com.company;

public class GenericsClass<T, V> {
    T x;
    V y;
    public GenericsClass(T x, V y) {
        this.x = x;
        this.y = y;
    }

    public T getX() {
        return x;
    }

    public V getY() {
        return y;
    }
}
