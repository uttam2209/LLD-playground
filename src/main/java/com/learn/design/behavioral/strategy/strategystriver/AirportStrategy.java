package com.learn.design.behavioral.strategy.strategystriver;

public class AirportStrategy implements MatchStrategy {
    @Override
    public void matchRide(String description) {
        System.out.println("Matching ride based on airport strategy.");
    }
}
