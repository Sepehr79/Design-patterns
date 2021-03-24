package com.designpatterns.creational.builder.advance;

import org.junit.Test;

public class AdvanceBuilder {

    @Test
    public void advanceBuild(){
          VehicleBuilder builder = new VehicleBuilder();

          Vehicle prideCar = builder.buildPrideCar();
          prideCar.move();

          Vehicle boeingAirplane = builder.buildBoeingAirplane();
          boeingAirplane.generateSound();
    }

}
