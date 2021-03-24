package com.designpatterns.creational.builder.advance;

public class Pride extends Car {
    @Override
    public void move() {
        System.out.println("Driving very bad");
    }

    @Override
    public void generateSound() {
        System.out.println("Low noise");
    }
}
