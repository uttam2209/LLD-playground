package com.learn.design.behavioral.observer;

public class MobileAppSubscriber implements Observer {
    private String deviceId;

    public MobileAppSubscriber(String deviceId) {
        this.deviceId = deviceId;
    }

    @Override
    public void update(String headline, String fullStory) {
        System.out.println("Push notification sent to device " + deviceId + " with headline: " + headline);
    }
}
