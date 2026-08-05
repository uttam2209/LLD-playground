package com.learn.design.structural.decorator;

public class ExtraSauce extends BurgerDecorator {

    public ExtraSauce(Burger burger) {
        this.burger = burger;
    }

    @Override
    double cost() {
        return burger.cost() + 25;
    }

    @Override
    String getDescription() {
        return burger.getDescription() + " with extra sauce";
    }
}
