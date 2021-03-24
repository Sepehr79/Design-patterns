package com.designpatterns.creational.builder.simpleclass;

import org.junit.Assert;
import org.junit.Test;

import java.util.Date;

public class BuilderPattern {

    @Test
    public void simpleBuilder(){

        Person person = new Person.Builder().
                setName("sepehr").
                setLastName("mollaei").
                setAge(20).
                setGender(Person.Gender.MALE).
                setBirthDay(new Date(2000, 5, 6)).
                build();

        Assert.assertEquals(person.getName(), "sepehr");
    }

}
