package com.refactorizando.patterns.prototype;

public class Parrot extends Animal{

  public String phrase;

  public Parrot() {
  }

  public Parrot(Parrot parrot) {
    super(parrot);
    if (parrot != null) {
      this.phrase = parrot.phrase;
    }
  }

  @Override
  public Animal clone() {
    return new Parrot(this);
  }

  @Override
  public boolean equals(Object object2) {
    if (!(object2 instanceof Parrot) || !super.equals(object2)) return false;
    Parrot shape2 = (Parrot) object2;
    return shape2.phrase == phrase;
  }

}
