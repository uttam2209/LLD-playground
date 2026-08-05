package com.learn.design.creational.factorystriver;

public class InvoiceFactory {

    public Invoice getInvoice(String region) {
        if (region.equalsIgnoreCase("india")) {
            return new GSTInvoice();
        } else if (region.equalsIgnoreCase("US")) {
            return new USInvoice();
        } else {
            throw new IllegalArgumentException("Invalid invoice");
        }
    }
}
