package com.learn.design.behavioral.command;

public class AcOffCommand implements Command {
    private final AirConditioner airConditioner;

    public AcOffCommand(AirConditioner airConditioner) {
        this.airConditioner = airConditioner;
    }

    @Override
    public void execute() {
        airConditioner.turnOff();
    }
}
