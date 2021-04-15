package com.designpatterns.creational.factory.beans;

public abstract class Person {

    private String name;

    private String lastName;

    private Integer age;

    private Gender gender;

    public Person(String name, String lastName, Integer age, Gender gender) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.gender = gender;
    }

    public Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public static enum Gender{
        MALE, FEMALE
    }

}
