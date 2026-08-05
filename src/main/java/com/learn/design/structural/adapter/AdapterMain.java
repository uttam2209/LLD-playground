package com.learn.design.structural.adapter;

public class AdapterMain {
    public static void main(String[] args) {
        PaymentGateway upi = new UpiPayment();
        upi.submitPayment(20.1);

        PaymentGateway razor = new RazorPayAdapter();
        razor.submitPayment(11);
    }
}
