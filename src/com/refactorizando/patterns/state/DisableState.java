package com.refactorizando.patterns.state;

public class DisableState extends State{

  DisableState(User user) {
    super(user);
    user.setBuying(false);
    user.setEnable(false);

  }

  @Override
  public String onActive() {
    user.changeState(new ActiveState(user));
    return "Disabled...";
  }

  @Override
  public String onLock() {
    user.changeState(new ActiveState(user));
    return "Disable locked...";
  }

  @Override
  public String onDisable() {
    if (user.isBuying()) {
      user.changeState(new ActiveState(user));
      return "Stop buying";
    } else {
      return "Disabled...";
    }
  }

  @Override
  public String onBuy() {
    user.changeState(new ActiveState(user));
    return "Disabled temporarily...";
  }
}
