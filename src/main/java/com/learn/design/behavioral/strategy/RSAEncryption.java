package com.learn.design.behavioral.strategy;

public class RSAEncryption implements Encryption {

    @Override
    public void encrypt(String data) {
        System.out.println("Encrypting data using RSA encryption: ");
    }
}
