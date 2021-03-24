package com.designpatterns.creational.builder.simpleclass;

import java.util.Date;

public class Person {

    private String name;
    private String lastName;
    private int age;
    private Gender gender;
    private Date birthDay;

    public static class Builder{
        private String name;
        private String lastName;
        private int age;
        private Gender gender;
        private Date birthDay;

        public Builder(){

        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public Builder setGender(Gender gender) {
            this.gender = gender;
            return this;
        }

        public Builder setBirthDay(Date birthDay) {
            this.birthDay = birthDay;
            return this;
        }

        public Person build(){
            return new Person(this);
        }
    }

    private Person(Builder builder){
        this.name = builder.name;
        this.lastName = builder.lastName;
        this.age = builder.age;
        this.gender = builder.gender;
        this.birthDay = builder.birthDay;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public Gender getGender() {
        return gender;
    }

    public Date getBirthDay() {
        return birthDay;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public void setBirthDay(Date birthDay) {
        this.birthDay = birthDay;
    }

    public static enum Gender{
        MALE, FEMALE
    }
}
