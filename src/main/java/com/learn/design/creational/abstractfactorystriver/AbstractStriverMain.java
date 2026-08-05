package com.learn.design.creational.abstractfactorystriver;

public class AbstractStriverMain {
    public static void main(String[] args) {
        CheckoutService checkoutService = new CheckoutService(new IndiaRegion(), "razorpay");
        checkoutService.checkout();
    }
}
