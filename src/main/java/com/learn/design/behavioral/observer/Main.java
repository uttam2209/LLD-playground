package com.learn.design.behavioral.observer;

public class Main {

    public static void main(String[] args) {
        Observer emailSubscriber = new EmailSubscriber("abc@xyz.com");
        Observer smsSubscriber = new SMSSubscriber(1234567890L);

        NewsAgency newsAgency = new NewsAgency();
        newsAgency.addObserver(emailSubscriber);
        newsAgency.addObserver(smsSubscriber);

        newsAgency.publishNews("Breaking News", "This is the full story of the breaking news");
    }
}
