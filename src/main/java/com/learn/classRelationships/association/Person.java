package com.learn.classRelationships.association;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Person {
    private String firstName;
    private Car car;

    public Person(String firstName,  Car car) {
        this.firstName = firstName;
        this.car = car;
    }

    void details() {
        System.out.println(firstName);
        System.out.println(car.getBrand());
    }
}
