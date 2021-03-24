package com.designpatterns.creational.singleton.simple;

public class Configuration {

    private static Configuration configuration;

    static {
        try{
            configuration = new Configuration();
        }catch (Exception exception){
            exception.printStackTrace();
        }

    }

    private Configuration(){

    }

    public static Configuration getConfiguration(){
        return configuration;
    }

    public String getMessage(){
        return "This is configuration";
    }

}
