package com.learn.design.creational.factory.model;

public class VeggiePizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("preparing simple veggie pizza");
    }

    @Override
    public void pack() {
        System.out.println("packing simple veggie pizza");
    }

    @Override
    public void deliver() {
        System.out.println("delivering simple veggie pizza");
    }
}
