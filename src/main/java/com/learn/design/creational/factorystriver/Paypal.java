package com.learn.design.creational.factorystriver;

public class Paypal implements PaymentGateway {
    @Override
    public void acceptPayment() {
        System.out.println("Paypal payment");
    }
}
