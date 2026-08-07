package com.learn.design.behavioral.strategy;

public class PushNotification extends Notification {

    public PushNotification(Encryption encryption, Compression compression) {
        super(encryption, compression);
    }

    @Override
    void notify(String message) {
        System.out.println("Push Notification: " + message);
    }
}
