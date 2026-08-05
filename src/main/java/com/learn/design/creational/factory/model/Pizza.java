package com.learn.design.creational.factory.model;

import java.util.ArrayList;
import java.util.List;

public abstract class Pizza {
    protected String name;
    protected String dough;
    protected String sauce;
    protected List<String> toppings = new ArrayList<>();
    protected List<String> ingredients;

    public Pizza(){};

    public Pizza(List<String> ingredients) {
        this.ingredients = ingredients;
    }

    public void prepare() {
        System.out.println("Preparing :: " + name);
        System.out.println("Tossing the dough :: " + dough);
        System.out.println("Smearing the sauce :: " + sauce);
        System.out.println("Adding toppings :: " + toppings.toString());
    }
    public abstract void pack();
    public abstract void deliver();
}
