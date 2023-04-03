package com.nwo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter
@AllArgsConstructor
@ToString
abstract public class Animal {

  private String name;

  public abstract void makeSound();



}
