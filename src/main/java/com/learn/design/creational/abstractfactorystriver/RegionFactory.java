package com.learn.design.creational.abstractfactorystriver;

public interface RegionFactory {
    PaymentGateway createPayment(String type);
    Invoice createInvoice();
}
