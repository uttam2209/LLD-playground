package com.learn.design.creational.factory;

import com.learn.design.creational.factory.model.CheesePizza;
import com.learn.design.creational.factory.model.FusionPizza;
import com.learn.design.creational.factory.model.Pizza;
import com.learn.design.creational.factory.model.VeggiePizza;

public class SimplePizzaFactory extends BasePizzaFactory {

    public Pizza createPizza(String type) {
        Pizza pizza;

        if (type.equalsIgnoreCase("cheese")) {
            pizza = new CheesePizza();
        } else if (type.equalsIgnoreCase("veggie")) {
            pizza = new VeggiePizza();
        } else if (type.equalsIgnoreCase("fusion")) {
            pizza = new FusionPizza();
        } else {
            throw new IllegalArgumentException("Unknown pizza type");
        }
        return pizza;
    }
}
