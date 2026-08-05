package com.learn.classRelationships.association;

public class AssociationExample {
    public static void main(String[] args) {
        Person person = new Person("personName", new Car("lexus"));
        person.details();
    }
}
