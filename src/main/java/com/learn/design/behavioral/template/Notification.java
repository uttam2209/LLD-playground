package com.learn.design.behavioral.template;

public abstract class Notification {

    // Final method that defines the template for sending a notification. It calls the common methods and the abstract methods that will be implemented by subclasses.
    public final void send(String to, String message) {
        checkRateLimiter();
        validateReceiver(to);
        formatMessage(message);
        sendMessage(to, message);
        analytics(to, message);
    }

    // Method common to all notification types. Cant be overriden by subclasses.
    private void checkRateLimiter() {
        System.out.println("Checking rate limiter");
    }

    // Method common to all notification types. Cant be overriden by subclasses.
    private void validateReceiver(String to) {
        System.out.println("Validating receiver: " + to);
    }

    // Abstract methods that will be implemented by subclasses. These methods are specific to each notification type.
    protected abstract void formatMessage(String message);
    protected abstract void sendMessage(String to, String message);

    // Optional hook method that can be overridden by subclasses. Default implementation if not overriden.
    protected void analytics(String to, String message) {
        System.out.println("Default analytics for message: " + message + " to: " + to);
    }
}
