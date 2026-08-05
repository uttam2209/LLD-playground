package com.learn.design.structural.adapter;

public class RazorPayAdapter implements PaymentGateway {
    private final RazorPayAPI razorPayAPI;

    public RazorPayAdapter() {
        this.razorPayAPI = new RazorPayAPI();
    }

    @Override
    public void submitPayment(double amount) {
        razorPayAPI.createPayment(amount);
    }
}
