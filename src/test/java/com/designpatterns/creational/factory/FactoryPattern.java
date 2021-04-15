package com.designpatterns.creational.factory;

import com.designpatterns.creational.factory.beans.Person;
import org.junit.Assert;
import org.junit.Test;

public class FactoryPattern {

    @Test
    public void testFactoryPattern(){

        PersonFactory personFactory = new PersonFactory();

        Person person = personFactory.createDefaultStudent();

        Assert.assertEquals(person.getName(), "sepehr");

    }

}
