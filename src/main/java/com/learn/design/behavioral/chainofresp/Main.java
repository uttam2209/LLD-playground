package com.learn.design.behavioral.chainofresp;

public class Main {

    public static void main(String[] args) {
        EscalationHandler lead = new Lead();
        EscalationHandler manager = new Manager();
        EscalationHandler srManager = new SeniorManager();
        EscalationHandler director = new Director();

        lead.setNextHandler(manager);
        manager.setNextHandler(srManager);
        srManager.setNextHandler(director);

        lead.handleRequest("VP");
    }
}
