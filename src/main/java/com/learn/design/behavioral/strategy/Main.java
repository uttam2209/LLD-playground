package com.learn.design.behavioral.strategy;

public class Main {

    public static void main(String[] args) {
        Notification emailNotification = new EmailNotification(new RSAEncryption(), new ZipCompression());
        emailNotification.notify("Hello, this is an email notification!");

        Notification smsNotification = new SMSNotification(new ECCEncryption(), new ZipCompression());
        smsNotification.notify("Hello, this is an SMS notification!");

        Notification pushNotification = new PushNotification(new RSAEncryption(), new GZipCompression());
        pushNotification.notify("Hello, this is a push notification!");
    }
}
