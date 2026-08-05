package com.learn.classRelationships.aggregation;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class Team {
    private String teamName;
    private List<Player> players = new ArrayList<>();

    public Team(String teamName) {
        this.teamName = teamName;
    }

    public void addPlayer(Player player) {
        players.add(player);
    }

    void showTeam() {
        System.out.println("Team Name: " + teamName + " :: Player details: ");
        players.forEach(player -> System.out.println(player.getName() + " " + player.getAge()));
    }
}
