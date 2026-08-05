package com.learn.design.structural.decorator;

public abstract class Burger {
    public enum SIZE {SMALL, MEDIUM, LARGE}
    private SIZE size = SIZE.SMALL;

    public SIZE getSize() {
        return size;
    }

    public void setSize(SIZE size) {
        this.size = size;
    }

    abstract String getDescription();
    abstract double cost();
}
