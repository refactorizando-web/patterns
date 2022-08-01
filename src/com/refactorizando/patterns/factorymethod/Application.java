package com.refactorizando.patterns.factorymethod;

public class Application {

  private static Shop shop;

  public static void main(String[] args) {
    configure(args);
    goShopping();
  }

  static void configure(String[] args) {

    if (null != args && args[0].equalsIgnoreCase("cash"))
      shop = new CreditPayment();
    else {
      shop = new CashPayment();
    }
  }

  static void goShopping() {
    shop.buySomething();
  }
}
