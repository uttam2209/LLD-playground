package com.learn.design.behavioral.template;

public class EmailNotification extends Notification {

    @Override
    protected void formatMessage(String message) {
        System.out.println("Formatting email message in html format <h>: " + message + "</h>");
    }

    @Override
    protected void sendMessage(String to, String message) {
        System.out.println("Sending email to: " + to + " with message: " + message);
    }
}
