package com.designpatterns.creational.factory;

import com.designpatterns.creational.factory.beans.Person;
import com.designpatterns.creational.factory.beans.Student;
import com.designpatterns.creational.factory.beans.Teacher;

public class PersonFactory {

    public Student createDefaultStudent(){
        return new Student("sepehr", "mollaei", 20, Person.Gender.MALE);
    }

    public Student createNewStudent(String name, String lastName, Integer age, Person.Gender gender){
        return new Student(name, lastName, age, gender);
    }

    public Teacher createDefaultTeacher(){
        return new Teacher("sepehr", "mollaei", 20, Person.Gender.MALE);
    }

    public Teacher createNewTeacher(String name, String lastName, Integer age, Person.Gender gender){
        return new Teacher(name, lastName, age, gender);
    }

}
