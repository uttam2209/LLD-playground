package com.learn.design.creational.factory;

import com.learn.design.creational.factory.model.NYCheesePizza;
import com.learn.design.creational.factory.model.NYFusionPizza;
import com.learn.design.creational.factory.model.NYVeggiePizza;
import com.learn.design.creational.factory.model.Pizza;

public class NYPizzaFactory extends BasePizzaFactory {

    public Pizza createPizza(String type) {
        Pizza pizza;

        if(type.equalsIgnoreCase("cheese")) {
            pizza = new NYCheesePizza();
        } else if (type.equalsIgnoreCase("fusion")) {
            pizza = new NYFusionPizza();
        } else if (type.equalsIgnoreCase("veggie")) {
            pizza = new NYVeggiePizza();
        } else {
            throw new IllegalArgumentException("NY pizza creation error");
        }
        return pizza;
    }
}
