package com.refactorizando.patterns.factorymethod;

public class CreditCard implements Payment{

  @Override
  public void paymentMethod() {

    System.out.println("Payment Method: Credit Card");

  }
}
