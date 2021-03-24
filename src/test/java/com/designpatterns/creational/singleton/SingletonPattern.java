package com.designpatterns.creational.singleton;

import com.designpatterns.creational.singleton.simple.Configuration;
import com.designpatterns.creational.singleton.threadsafe.ThreadSafeConfiguration;
import org.junit.Test;

public class SingletonPattern {

    @Test
    public void singleton(){

        Configuration configuration = Configuration.getConfiguration();

        ThreadSafeConfiguration threadSafeConfiguration = ThreadSafeConfiguration.getConfiguration();

        System.out.println(configuration.getMessage());

        System.out.println(threadSafeConfiguration.getMessage());
    }

}
