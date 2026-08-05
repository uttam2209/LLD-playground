package com.learn.design.creational.factory.model;

public class ChicagoFusionPizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("preparing Chicago fusion pizza");
    }

    @Override
    public void pack() {
        System.out.println("packing Chicago fusion pizza");
    }

    @Override
    public void deliver() {
        System.out.println("delivering Chicago fusion pizza");
    }
}
