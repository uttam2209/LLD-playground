package com.learn.design.behavioral.observer;

public class SMSSubscriber implements Observer {
    private Long phoneNumber;

    public SMSSubscriber(Long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void update(String headline, String fullStory) {
        System.out.println("SMS sent to " + phoneNumber + " with headline: " + headline);
    }
}
