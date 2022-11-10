package com.refactorizando.patterns.state;

public class User {

  private State state;
  private boolean buying = false;
  private boolean enable = false;

  public User() {
    this.state = new ActiveState(this);
    setEnable(true);
    setBuying(true);
  }

  public String startBuy() {
    return "Buying t-shirt" ;
  }
  public void changeState(State state) {
    this.state = state;
  }

  public State getState() {
    return state;
  }

  public void setEnable(boolean enable) {
    this.enable = enable;
  }

  public Boolean getEnable() {
    return enable;
  }

  public void setBuying(boolean buying) {
    this.buying = buying;
  }

  public boolean isBuying() {
    return buying;
  }

}
