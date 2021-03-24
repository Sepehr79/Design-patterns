package com.designpatterns.creational.singleton.threadsafe;

public class ThreadSafeConfiguration {

    private static ThreadSafeConfiguration configuration;

    private ThreadSafeConfiguration(){

    }

    public static synchronized ThreadSafeConfiguration getConfiguration(){
        if (configuration == null){
            try {
                configuration = new ThreadSafeConfiguration();
            }catch (Exception exception){
                exception.printStackTrace();
            }
        }
        return configuration;
    }

    public String getMessage(){
        return "This is thread safe configuration";
    }

}
