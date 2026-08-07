package com.learn.design.behavioral.strategy;

public class GZipCompression implements Compression {

    @Override
    public void compress(String data) {
        System.out.println("Compressing data using GZip compression: ");
    }
}
