package com.learn.design.structural.decorator;

public class Veggie extends Burger {

    @Override
    double cost() {
        return 100;
    }

    @Override
    String getDescription() {
        return "Veggie burger";
    }
}
