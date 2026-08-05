package com.learn.design.creational.abstractfactorystriver;

public class USInvoice implements Invoice {
    @Override
    public void generateInvoice() {
        System.out.println("US invoice");
    }
}
