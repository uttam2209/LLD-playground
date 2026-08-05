package com.learn.design.creational.factorystriver;

public class CheckoutService {
    private final PaymentFactory paymentFactory;
    private final InvoiceFactory invoiceFactory;

    public CheckoutService(PaymentFactory paymentFactory, InvoiceFactory invoiceFactory) {
        this.paymentFactory = paymentFactory;
        this.invoiceFactory = invoiceFactory;
    }

    public void checkout(String type, String region) {
        PaymentGateway paymentGateway = paymentFactory.paymentProvider(type);
        paymentGateway.acceptPayment();

        Invoice invoice = invoiceFactory.getInvoice(region);
        invoice.generateInvoice();
    }
}
