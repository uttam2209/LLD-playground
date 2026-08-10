package com.learn.design.behavioral.template;

public class SMSNotification extends Notification {

    @Override
    protected void formatMessage(String message) {
        System.out.println("Formatting SMS message: " + message);
    }

    @Override
    protected void sendMessage(String to, String message) {
        System.out.println("Sending SMS to: " + to + " with message: " + message);
    }

    @Override
    protected void analytics(String to, String message) {
        System.out.println("Sending SMS analytics for message: " + message + " to: " + to);
        super.analytics(to, message);
    }
}
