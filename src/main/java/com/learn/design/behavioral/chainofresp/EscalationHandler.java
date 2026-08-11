package com.learn.design.behavioral.chainofresp;

public abstract class EscalationHandler {
    protected EscalationHandler nextHandler;

    public void setNextHandler(EscalationHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public abstract void handleRequest(String issue);
}
