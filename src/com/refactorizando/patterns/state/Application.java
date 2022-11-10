package com.refactorizando.patterns.state;

public class Application {

  public static void main(String[] args) {

    User user = new User();
    user.setBuying(true);
    user.setEnable(true);

    ActiveState activeState = new ActiveState(user);
    activeState.onActive();

    BuyingState buyingState = new BuyingState(user);
    buyingState.onBuy();

    DisableState disableState = new DisableState(user);
    disableState.onDisable();

    LockState lockState = new LockState(user);
    lockState.onLock();
  }
}
