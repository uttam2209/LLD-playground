package com.learn.design.behavioral.chainofresp;

public class Manager extends EscalationHandler {

    @Override
    public void handleRequest(String issue) {
        if(issue.equalsIgnoreCase("manager")) {
            System.out.println("Manager is able to handle the escalation");
        } else if (nextHandler != null) {
            nextHandler.handleRequest(issue);
        }
    }
}
