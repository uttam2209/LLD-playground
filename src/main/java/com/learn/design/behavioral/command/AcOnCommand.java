package com.learn.design.behavioral.command;

public class AcOnCommand implements Command {
    private final AirConditioner airConditioner;

    public AcOnCommand(AirConditioner airConditioner) {
        this.airConditioner = airConditioner;
    }

    @Override
    public void execute() {
        airConditioner.turnOn();
    }
}
