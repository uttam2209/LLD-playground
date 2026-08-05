package com.learn.design.creational.factorystriver;

public class PaymentStriverMain {
    public static void main(String[] args) {
        CheckoutService checkoutService = new CheckoutService(new PaymentFactory(), new InvoiceFactory());
        checkoutService.checkout("zelle", "us");
    }
}
