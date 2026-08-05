package com.learn.design.creational.factorystriver;

public class PaymentFactory {

    public PaymentGateway paymentProvider(String type) {
        if (type.equalsIgnoreCase("zelle")) {
            return new Zelle();
        } else if (type.equalsIgnoreCase("paypal")) {
            return new Paypal();
        } else if (type.equalsIgnoreCase("upi")) {
            return new Upi();
        } else if (type.equalsIgnoreCase("razorpay")) {
            return new RazorPay();
        } else {
            throw new IllegalArgumentException("Invalid payment type");
        }
    }
}
