package com.learn.design.behavioral.strategy.strategystriver;

public class MatchingService {
    private final MatchStrategy matchStrategy;

    public MatchingService(MatchStrategy matchStrategy) {
        this.matchStrategy = matchStrategy;
    }

    void match(String description) {
        matchStrategy.matchRide(description);
    }
}
