package com.designpatterns.creational.factory.beans;

public class Student extends Person{

    public Student(){
        super();
    }

    public Student(String name, String lastName, Integer age, Gender gender){
        super(name, lastName, age, gender);
    }

    public void study(){
        System.out.println("Study lessons");
    }

}
