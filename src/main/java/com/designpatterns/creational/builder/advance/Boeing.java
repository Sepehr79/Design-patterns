package com.designpatterns.creational.builder.advance;

public class Boeing implements Vehicle{
    @Override
    public void move() {
        System.out.println("Fly!");
    }

    @Override
    public void generateSound() {
        System.out.println("High sound!");
    }
}
