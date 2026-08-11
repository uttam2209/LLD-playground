package com.learn.design.behavioral.chainofresp;

public class Director extends EscalationHandler {

    @Override
    public void handleRequest(String issue) {
        if(issue.equalsIgnoreCase("director")) {
            System.out.println("Director is able to handle the escalation");
        } else if (nextHandler != null) {
            nextHandler.handleRequest(issue);
        } else {
            System.out.println("No one is able to handle the escalation");
        }
    }
}
