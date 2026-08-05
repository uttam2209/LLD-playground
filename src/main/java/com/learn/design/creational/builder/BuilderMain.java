package com.learn.design.creational.builder;

public class BuilderMain {
    public static void main(String[] args) {
        ClassWithLotOfProps.ClassWithLotOfPropsBuilder classWithLotOfPropsBuilder = new ClassWithLotOfProps.ClassWithLotOfPropsBuilder();
        ClassWithLotOfProps obj = classWithLotOfPropsBuilder
                .setFirstName("fname")
                .setLastName("lname")
                .setAge(22)
                .build();

        System.out.println(obj.getLastName() + " " + obj.getAddress());
    }
}
