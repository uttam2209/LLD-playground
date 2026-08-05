package com.learn.design.structural.adapter;

public class UpiPayment implements PaymentGateway {

    @Override
    public void submitPayment(double amount) {
        System.out.println("Submitting payment via UPI for amount " + amount);
    }
}
