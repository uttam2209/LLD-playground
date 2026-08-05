package com.learn.classRelationships.aggregation;


public class AggregationExample {
    public static void main(String[] args) {
        Team team = new Team("RCB");
        team.addPlayer(new Player("ABD", 35));
        team.addPlayer(new Player("DK", 40));

        team.showTeam();
    }
}
