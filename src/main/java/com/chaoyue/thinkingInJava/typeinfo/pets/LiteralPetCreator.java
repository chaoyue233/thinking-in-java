//: typeinfo/pets/LiteralPetCreator.java
// Using class literals.
package com.chaoyue.thinkingInJava.typeinfo.pets;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LiteralPetCreator extends PetCreator {
  // No try block needed.
  @SuppressWarnings("unchecked")
  public static final List<Class<? extends Pet>> allTypes =
    Collections.unmodifiableList(Arrays.asList(
      Pet.class, Dog.class, Cat.class,  Rodent.class,
      Mutt.class, Pug.class, EgyptianMau.class, Manx.class,
      Cymric.class, Rat.class, Mouse.class,Hamster.class));
  // Types for random creation:
  private static final List<Class<? extends Pet>> types =
    allTypes.subList(allTypes.indexOf(Mutt.class),
      allTypes.size());
  public List<Class<? extends Pet>> types() {
    return types;
  }	
  public static void main(String[] args) {
    System.out.println(types);
  }
} /* Output:
[class com.chaoyue.thinkingInJava.typeinfo.pets.Mutt, class com.chaoyue.thinkingInJava.typeinfo.pets.Pug, class com.chaoyue.thinkingInJava.typeinfo.pets.EgyptianMau, class com.chaoyue.thinkingInJava.typeinfo.pets.Manx, class com.chaoyue.thinkingInJava.typeinfo.pets.Cymric, class com.chaoyue.thinkingInJava.typeinfo.pets.Rat, class com.chaoyue.thinkingInJava.typeinfo.pets.Mouse, class com.chaoyue.thinkingInJava.typeinfo.pets.Hamster]
*///:~
