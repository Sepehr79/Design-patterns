package com.designpatterns.creational.factory.beans;

public class Teacher extends Person {

    public Teacher(){
        super();
    }

    public Teacher(String name, String lastName, Integer age, Person.Gender gender){
        super(name, lastName, age, gender);
    }

    public void teach(){
        System.out.println("Teach lessons");
    }

}
