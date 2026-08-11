package com.learn.design.behavioral.chainofresp;

public class SeniorManager extends EscalationHandler {

    @Override
    public void handleRequest(String issue) {
        if(issue.equalsIgnoreCase("senior-manager")) {
            System.out.println("Sr Manager is able to handle the escalation");
        } else if (nextHandler != null) {
            nextHandler.handleRequest(issue);
        }

    }
}
