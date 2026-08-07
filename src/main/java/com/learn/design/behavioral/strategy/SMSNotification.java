package com.learn.design.behavioral.strategy;

public class SMSNotification extends Notification {

    public SMSNotification(Encryption encryption, Compression compression) {
        super(encryption, compression);
    }

    @Override
    void notify(String message) {
        System.out.println("SMS Notification: " + message);
    }
}
