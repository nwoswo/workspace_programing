package com.nwo;

import java.io.FileNotFoundException;

public class Main {

  public static void main(String[] args) throws FileNotFoundException {
    new NumberExtractorReport().prepareAndSendReport("src/data.txt");

    new EmailExtractorReport().prepareAndSendReport("src/data.txt");

  }

  private static void catsAndDogs(){
    Animal dog = new Dog("Roco");
    Animal cat = new Cat("Gardfield");


    dog.makeSound();
    cat.makeSound();

  }

}
