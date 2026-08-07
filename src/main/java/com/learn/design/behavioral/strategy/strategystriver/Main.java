package com.learn.design.behavioral.strategy.strategystriver;

public class Main {

    public static void main(String[] args) {
        MatchingService matchingService = new MatchingService(new AirportStrategy());
        matchingService.match("Airport");

        MatchingService matchingService1 = new MatchingService(new LocationStrategy());
        matchingService1.match("Mason");

        MatchingService matchingService2 = new MatchingService(new SurgeStrategy());
        matchingService2.match("Surge");
    }
}
