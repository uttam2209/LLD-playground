package com.learn.design.structural.decorator;

public class Fries extends BurgerDecorator {

    public Fries(Burger burger) {
        this.burger = burger;
    }

    @Override
    double cost() {
        return burger.cost() + 50;
    }

    @Override
    String getDescription() {
        return burger.getDescription() + " with Fries";
    }
}
