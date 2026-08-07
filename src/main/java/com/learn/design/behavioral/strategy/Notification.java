package com.learn.design.behavioral.strategy;

public abstract class Notification {
    private final Encryption encryption;
    private final Compression compression;

    public Notification(Encryption encryption, Compression compression) {
        this.encryption = encryption;
        this.compression = compression;
    }

    abstract void notify(String message);

    void encrypt(String message) {
        encryption.encrypt(message);
    }

    void compress(String message) {
        compression.compress(message);
    }
}
