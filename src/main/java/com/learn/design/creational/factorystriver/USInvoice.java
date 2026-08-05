package com.learn.design.creational.factorystriver;

public class USInvoice implements Invoice {
    @Override
    public void generateInvoice() {
        System.out.println("US invoice");
    }
}
