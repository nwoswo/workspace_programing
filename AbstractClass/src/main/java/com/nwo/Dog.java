package com.nwo;

public class Dog extends Animal {
  public Dog(String name){
    super(name);
  }

  @Override
  public void makeSound() {
    System.out.println("Woff woff");
  }
}
