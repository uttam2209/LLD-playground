package com.learn.design.structural.decorator;

public class Paneer extends Burger {

    @Override
    double cost() {
        return 150;
    }

    @Override
    String getDescription() {
        return "Paneer burger";
    }
}
