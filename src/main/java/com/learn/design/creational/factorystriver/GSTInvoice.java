package com.learn.design.creational.factorystriver;

public class GSTInvoice implements Invoice {
    @Override
    public void generateInvoice() {
        System.out.println("GST invoice");
    }
}
