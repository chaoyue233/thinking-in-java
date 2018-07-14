//: typeinfo/pets/ForNameCreator.java
package com.chaoyue.thinkingInJava.typeinfo.pets;

import java.util.ArrayList;
import java.util.List;

public class ForNameCreator extends PetCreator {
  private static List<Class<? extends Pet>> types =
    new ArrayList<Class<? extends Pet>>();
  // Types that you want to be randomly created:
  private static String[] typeNames = {
    "com.chaoyue.thinkingInJava.typeinfo.pets.Mutt",
    "com.chaoyue.thinkingInJava.typeinfo.pets.Pug",
    "com.chaoyue.thinkingInJava.typeinfo.pets.EgyptianMau",
    "com.chaoyue.thinkingInJava.typeinfo.pets.Manx",
    "com.chaoyue.thinkingInJava.typeinfo.pets.Cymric",
    "com.chaoyue.thinkingInJava.typeinfo.pets.Rat",
    "com.chaoyue.thinkingInJava.typeinfo.pets.Mouse",
    "com.chaoyue.thinkingInJava.typeinfo.pets.Hamster"
  };	
  @SuppressWarnings("unchecked")
  private static void loader() {
    try {
      for(String name : typeNames)
        types.add(
          (Class<? extends Pet>)Class.forName(name));
    } catch(ClassNotFoundException e) {
      throw new RuntimeException(e);
    }
  }
  static { loader(); }
  public List<Class<? extends Pet>> types() {return types;}
} ///:~
