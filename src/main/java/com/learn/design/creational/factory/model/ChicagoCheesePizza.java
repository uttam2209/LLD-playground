package com.learn.design.creational.factory.model;

public class ChicagoCheesePizza extends Pizza {

    @Override
    public void prepare() {
        System.out.println("preparing Chicago cheese pizza");
    }

    @Override
    public void pack() {
        System.out.println("packing Chicago cheese pizza");
    }

    @Override
    public void deliver() {
        System.out.println("delivering Chicago cheese pizza");
    }
}
