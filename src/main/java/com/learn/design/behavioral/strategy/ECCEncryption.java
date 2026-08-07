package com.learn.design.behavioral.strategy;

public class ECCEncryption implements Encryption {

    @Override
    public void encrypt(String data) {
        System.out.println("Encrypting data using ECC encryption: ");
    }
}
