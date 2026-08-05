package com.learn.design.creational.factory.model;

public class NYCheesePizza extends Pizza {

    @Override
    public void prepare() {
        System.out.println("preparing NY cheese pizza");
    }

    @Override
    public void pack() {
        System.out.println("packing NY cheese pizza");
    }

    @Override
    public void deliver() {
        System.out.println("delivering NY cheese pizza");
    }
}
