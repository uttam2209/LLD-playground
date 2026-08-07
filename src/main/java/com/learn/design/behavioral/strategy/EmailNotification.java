package com.learn.design.behavioral.strategy;

public class EmailNotification extends Notification {

    public EmailNotification(Encryption encryption, Compression compression) {
        super(encryption, compression);
    }

    @Override
    void notify(String message) {
        System.out.println("Email Notification: " + message);
    }
}
