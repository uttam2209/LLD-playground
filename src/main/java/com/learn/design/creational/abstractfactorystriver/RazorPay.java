package com.learn.design.creational.abstractfactorystriver;

public class RazorPay implements PaymentGateway {
    @Override
    public void acceptPayment() {
        System.out.println("Razorpay payment");
    }
}
