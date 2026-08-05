package com.learn.design.creational.factory.model;

import java.util.List;

public class CheesePizza extends Pizza {

    public CheesePizza() {
        name = "Regular cheese pizza";
        dough = "all purpose flour";
        sauce = "frozen red sauce";
        toppings = List.of("jalapenos");
    }

    @Override
    public void pack() {
        System.out.println("packing simple cheese pizza");
    }

    @Override
    public void deliver() {
        System.out.println("delivering simple cheese pizza");
    }
}
