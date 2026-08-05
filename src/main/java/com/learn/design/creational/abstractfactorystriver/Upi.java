package com.learn.design.creational.abstractfactorystriver;

public class Upi implements PaymentGateway {
    @Override
    public void acceptPayment() {
        System.out.println("UPI payment");
    }
}
