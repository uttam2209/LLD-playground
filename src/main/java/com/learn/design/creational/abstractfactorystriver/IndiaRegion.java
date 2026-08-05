package com.learn.design.creational.abstractfactorystriver;

public class IndiaRegion implements RegionFactory {

    @Override
    public PaymentGateway createPayment(String type) {
        if (type.equalsIgnoreCase("razorpay")) {
            return new RazorPay();
        } else if (type.equalsIgnoreCase("upi")) {
            return new Upi();
        } else {
            throw new IllegalArgumentException("Invalid payment type");
        }
    }

    @Override
    public Invoice createInvoice() {
        return new GSTInvoice();
    }
}
