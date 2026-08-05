package com.learn.design.creational.abstractfactorystriver;

public class USRegion implements RegionFactory {

    @Override
    public PaymentGateway createPayment(String type) {
        if (type.equalsIgnoreCase("zelle")) {
            return new Zelle();
        } else if (type.equalsIgnoreCase("paypal")) {
            return new Paypal();
        } else {
            throw new IllegalArgumentException("Invalid payment type");
        }
    }

    @Override
    public Invoice createInvoice() {
        return new USInvoice();
    }
}
