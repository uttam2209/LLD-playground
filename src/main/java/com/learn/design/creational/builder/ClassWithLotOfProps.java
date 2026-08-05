package com.learn.design.creational.builder;

import lombok.Getter;

@Getter
public class ClassWithLotOfProps {
    private final String firstName;
    private final String lastName;
    private final int age;
    private final String address;
    private final Long phoneNumber;
    private final String email;

    private ClassWithLotOfProps(ClassWithLotOfPropsBuilder builder) {
        this.firstName = builder.getFirstName();
        this.lastName = builder.getLastName();
        this.age = builder.getAge();
        this.address = builder.getAddress();
        this.phoneNumber = builder.getPhoneNumber();
        this.email = builder.getEmail();
    }

    //Inner builder class
    @Getter
    public static class ClassWithLotOfPropsBuilder {
        private String firstName;
        private String lastName;
        private int age;
        private String address;
        private Long phoneNumber;
        private String email;

        public ClassWithLotOfPropsBuilder setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public ClassWithLotOfPropsBuilder setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public ClassWithLotOfPropsBuilder setAge(int age) {
            this.age = age;
            return this;
        }

        public ClassWithLotOfPropsBuilder setAddress(String address) {
            this.address = address;
            return this;
        }

        public ClassWithLotOfPropsBuilder setPhoneNumber(Long phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }

        public ClassWithLotOfPropsBuilder setEmail(String email) {
            this.email = email;
            return this;
        }

        public ClassWithLotOfProps build () {
            return new ClassWithLotOfProps(this);
        }
    }
}
