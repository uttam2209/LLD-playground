package com.learn.design.creational.abstractfactorystriver;

public class Paypal implements PaymentGateway {
    @Override
    public void acceptPayment() {
        System.out.println("Paypal payment");
    }
}
