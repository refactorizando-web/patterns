package com.refactorizando.patterns.factorymethod;

public class Cash implements Payment{

  @Override
  public void paymentMethod() {

    System.out.println("Payment Method: Cash");

  }
}
