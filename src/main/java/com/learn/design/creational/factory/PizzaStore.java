package com.learn.design.creational.factory;

import com.learn.design.creational.factory.model.Pizza;

public class PizzaStore {
    private final BasePizzaFactory factory;

    public PizzaStore(BasePizzaFactory factory) {
        this.factory = factory;
    }

    public void orderPizza(String type) {
        Pizza pizza = factory.createPizza(type);
        pizza.prepare();
        pizza.pack();
        pizza.deliver();
    }
}
