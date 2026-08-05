package com.learn.design.structural.decorator;

public class DecoratorMain {
    public static void main(String[] args) {
        Burger burger = new Veggie();
        burger.setSize(Burger.SIZE.SMALL);

        System.out.println(burger.getDescription() + " :: " + burger.cost());

        burger = new Fries(burger);
        System.out.println(burger.getDescription() + " :: " + burger.cost());

        burger = new ExtraSauce(burger);
        System.out.println(burger.getDescription() + " :: " + burger.cost());
    }
}
