package com.learn.design.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class NewsAgency {
    private final List<Observer> observers;

    public NewsAgency() {
        this.observers = new ArrayList<>();
    }

    void addObserver(Observer observer) {
        observers.add(observer);
    }

    void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    void publishNews(String headline, String fullStory) {
        for (Observer observer: observers){
            observer.update(headline, fullStory);
        }
    }
}
