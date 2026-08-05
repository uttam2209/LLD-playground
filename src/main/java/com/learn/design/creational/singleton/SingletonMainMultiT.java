package com.learn.design.creational.singleton;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SingletonMainMultiT {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(2);

        //This will break Singleton because each thread ends up creating an instance. Run and see the print statement
        executorService.execute(SingletonPattern::getInstance);
        executorService.execute(SingletonPattern::getInstance);

    }
}
