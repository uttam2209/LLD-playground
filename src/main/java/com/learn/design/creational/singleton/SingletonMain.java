package com.learn.design.creational.singleton;

public class SingletonMain {
    public static void main(String[] args) {
        SingletonPattern singletonPattern1 = SingletonPattern.getInstance();
        SingletonPattern singletonPattern2 = SingletonPattern.getInstance();
        System.out.println(singletonPattern1 == singletonPattern2);
    }
}
