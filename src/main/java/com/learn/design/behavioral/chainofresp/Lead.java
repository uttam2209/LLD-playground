package com.learn.design.behavioral.chainofresp;

public class Lead extends EscalationHandler {

    @Override
    public void handleRequest(String issue) {
        if (issue.equalsIgnoreCase("lead")) {
            System.out.println("Lead is able to handle the escalation");
        } else if (nextHandler != null) {
            nextHandler.handleRequest(issue);
        }
    }
}
