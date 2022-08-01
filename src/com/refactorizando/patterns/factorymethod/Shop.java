package com.refactorizando.patterns.factorymethod;

public abstract class Shop {

  public void buySomething() {

    Payment payment = makePayment();
    makePayment().paymentMethod();
  }

  public abstract Payment makePayment();

}
