package com.learn.design.creational.abstractfactorystriver;

public class CheckoutService {
    private final RegionFactory regionFactory;
    private final String type;

    public CheckoutService(RegionFactory regionFactory, String type) {
        this.regionFactory = regionFactory;
        this.type = type;
    }

    public void checkout() {
        PaymentGateway paymentGateway = regionFactory.createPayment(type);
        paymentGateway.acceptPayment();

        Invoice invoice = regionFactory.createInvoice();
        invoice.generateInvoice();
    }
}
