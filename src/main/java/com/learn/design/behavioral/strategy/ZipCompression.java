package com.learn.design.behavioral.strategy;

public class ZipCompression implements Compression {

    @Override
    public void compress(String data) {
        System.out.println("Compressing data using ZIP compression: ");
    }
}
