package com.learn.design.behavioral.state;

public class Main {
    public static void main(String[] args) {
        OrderContext orderContext = new OrderContext();
        System.out.println("Current Order State: " + orderContext.getStateName());

        orderContext.nextState();
        System.out.println("Current Order State: " + orderContext.getStateName());

        orderContext.cancelOrder();
        System.out.println("Current Order State: " + orderContext.getStateName());

        orderContext.nextState();
        System.out.println("Current Order State: " + orderContext.getStateName());

    }
}
