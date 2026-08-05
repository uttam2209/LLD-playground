package com.learn.design.creational.abstractfactorystriver;

public class Zelle implements PaymentGateway {
    @Override
    public void acceptPayment() {
        System.out.println("Zelle payment");
    }
}
