package com.learn.design.behavioral.observer;

public class EmailSubscriber implements Observer {
    private String email;

    public EmailSubscriber(String email) {
        this.email = email;
    }

    @Override
    public void update(String headline, String fullStory) {
        System.out.println("Email sent to " + email + " with headline: " + headline);
    }
}
