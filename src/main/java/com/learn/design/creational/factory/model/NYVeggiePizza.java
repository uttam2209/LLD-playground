package com.learn.design.creational.factory.model;

public class NYVeggiePizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("preparing NY veggie pizza");
    }

    @Override
    public void pack() {
        System.out.println("packing NY veggie pizza");
    }

    @Override
    public void deliver() {
        System.out.println("delivering NY veggie pizza");
    }
}
