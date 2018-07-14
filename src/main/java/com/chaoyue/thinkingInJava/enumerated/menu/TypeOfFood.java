//: enumerated/menu/TypeOfFood.java
package com.chaoyue.thinkingInJava.enumerated.menu;
import static com.chaoyue.thinkingInJava.enumerated.menu.Food.*;

public class TypeOfFood {
  public static void main(String[] args) {
    Food food = Appetizer.SALAD;
    food = MainCourse.LASAGNE;
    food = Dessert.GELATO;
    food = Coffee.CAPPUCCINO;
  }
} ///:~
