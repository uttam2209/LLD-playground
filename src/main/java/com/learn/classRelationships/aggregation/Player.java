package com.learn.classRelationships.aggregation;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Player {
    private String name;
    private int age;

    public Player(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
