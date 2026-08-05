package com.learn.design.creational.singleton;

public class SingletonPattern {
    private static volatile SingletonPattern instance = null;
    private SingletonPattern(){
        System.out.println("Constructor called");
    };

    public static SingletonPattern getInstance() {
        if (instance == null) {
            synchronized (SingletonPattern.class) {
                if (instance ==  null) {
                    instance = new SingletonPattern(); //this is double-checking.
                }
            }
        }
        return instance;
    }
}
