package com.learn.design.creational.factorystriver;

public class Zelle implements PaymentGateway {
    @Override
    public void acceptPayment() {
        System.out.println("Zelle payment");
    }
}
