package com.learn.design.creational.factory;

import com.learn.design.creational.factory.model.*;

public class ChicagoPizzaFactory extends BasePizzaFactory {

    public Pizza createPizza(String type) {
        Pizza pizza;

        if(type.equalsIgnoreCase("cheese")) {
            pizza = new ChicagoCheesePizza();
        } else if (type.equalsIgnoreCase("fusion")) {
            pizza = new ChicagoFusionPizza();
        } else if (type.equalsIgnoreCase("veggie")) {
            pizza = new ChicagoVeggiePizza();
        } else {
            throw new IllegalArgumentException("Chicago pizza creation error");
        }
        return pizza;
    }
}
