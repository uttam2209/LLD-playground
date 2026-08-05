package com.learn.design.creational.factory;

public class FactoryMain {
    public static void main(String[] args) {
        PizzaStore store = new PizzaStore(new NYPizzaFactory());
        store.orderPizza("cheese");
    }
}
