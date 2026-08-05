package com.learn.design.creational.factorystriver;

public class RazorPay implements PaymentGateway {
    @Override
    public void acceptPayment() {
        System.out.println("Razorpay payment");
    }
}
