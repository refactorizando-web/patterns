package com.refactorizando.patterns.prototype;

import java.util.ArrayList;
import java.util.List;

public class Application {

  public static void main(String[] args) {
    List<Animal> animals = new ArrayList<>();

    Cat cat = new Cat();
    cat.legs = 4;
    cat.mammal = true;
    cat.omnivorous = true;
    cat.color = "black";
    cat.flexibility = true;
    animals.add(cat);

    Cat anotherCat = (Cat) cat.clone();
    animals.add(anotherCat);

    Parrot parrot = new Parrot();
    parrot.phrase = "Hello, how are you?";
    parrot.color = "yellow";
    parrot.legs = 2;
    parrot.mammal = false;
    parrot.omnivorous = true;
    animals.add(parrot);

    Parrot anotherParrot = (Parrot) parrot.clone();
    animals.add(anotherParrot);


    System.out.println("Cats equals " + animals.get(0).equals(animals.get(1)));
    System.out.println("Parrots equals " +animals.get(2).equals(animals.get(3)));
  }

}
