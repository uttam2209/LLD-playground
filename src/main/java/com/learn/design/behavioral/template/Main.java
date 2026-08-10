package com.learn.design.behavioral.template;

public class Main {

    public static void main(String[] args) {
        Notification emailNotification = new EmailNotification();
        emailNotification.send("abc@xyz.com", "Hello, this is an email notification!");

        Notification smsNotification = new SMSNotification();
        smsNotification.send("+1234567890", "Hello, this is an SMS notification!");
    }
}
