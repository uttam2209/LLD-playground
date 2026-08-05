package com.learn.design.creational.factory;

import com.learn.design.creational.factory.model.Pizza;

public abstract class BasePizzaFactory {
    public abstract Pizza createPizza(String type);
}
