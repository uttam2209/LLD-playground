package com.learn.design.creational.abstractfactorystriver;

public class GSTInvoice implements Invoice {
    @Override
    public void generateInvoice() {
        System.out.println("GST invoice");
    }
}
