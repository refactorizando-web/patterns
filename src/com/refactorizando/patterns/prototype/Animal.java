package com.refactorizando.patterns.prototype;

import java.util.Objects;

public abstract class Animal {
  public int legs;
  public boolean omnivorous;
  public boolean mammal;
  public String color;

  public Animal() {
  }

  public Animal(Animal target) {
    if (target != null) {
      this.legs = target.legs;
      this.omnivorous = target.omnivorous;
      this.mammal = target.mammal;
      this.color = target.color;

    }
  }

  public abstract Animal clone();

  @Override
  public boolean equals(Object object2) {
    if (!(object2 instanceof Animal)) return false;
    Animal animal2 = (Animal) object2;
    return animal2.omnivorous = omnivorous && animal2.legs == legs
        && animal2.mammal == mammal && Objects.equals(animal2.color, color);
  }
}