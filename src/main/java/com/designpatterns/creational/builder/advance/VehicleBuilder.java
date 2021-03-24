package com.designpatterns.creational.builder.advance;

public class VehicleBuilder {

    public Vehicle buildPrideCar(){
        return new Pride();
    }

    public Vehicle buildBoeingAirplane(){
        return new Boeing();
    }

}
