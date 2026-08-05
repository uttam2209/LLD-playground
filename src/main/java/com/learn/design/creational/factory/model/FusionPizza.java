package com.learn.design.creational.factory.model;

public class FusionPizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("preparing simple fusion pizza");
    }

    @Override
    public void pack() {
        System.out.println("packing simple fusion pizza");
    }

    @Override
    public void deliver() {
        System.out.println("delivering simple fusion pizza");
    }
}
