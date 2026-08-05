package com.learn.design.creational.factory.model;

public class ChicagoVeggiePizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("preparing Chicago veggie pizza");
    }

    @Override
    public void pack() {
        System.out.println("packing Chicago veggie pizza");
    }

    @Override
    public void deliver() {
        System.out.println("delivering Chicago veggie pizza");
    }
}
