package com.refactorizando.patterns.builder;

public class Application {

  public static void main(String[] args) {

    Dealership dealership = new Dealership();

    // The client wants a simple and small car
    CarBuilder builder = new CarBuilder();
    dealership.createSmallCar(builder);

    Car car = builder.getCar();
    System.out.println("My :" + car.getCarType() + " car");

  }

}
