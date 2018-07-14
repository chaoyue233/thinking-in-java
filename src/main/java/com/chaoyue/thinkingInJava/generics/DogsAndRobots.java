package com.chaoyue.thinkingInJava.generics;
// No latent typing in Java

import com.chaoyue.thinkingInJava.typeinfo.pets.*;

import static com.chaoyue.thinkingInJava.net.mindview.util.Print.*;
import static com.chaoyue.thinkingInJava.net.mindview.util.Print.print;

class PerformingDog extends com.chaoyue.thinkingInJava.typeinfo.pets.Dog implements Performs {
  public void speak() { print("Woof!"); }
  public void sit() { print("Sitting"); }
  public void reproduce() {}
}

class Robot implements Performs {
  public void speak() { print("Click!"); }
  public void sit() { print("Clank!"); }
  public void oilChange() {}
}

class Communicate {
  public static <T extends Performs>
  void perform(T performer) {
    performer.speak();
    performer.sit();
  }
}

public class DogsAndRobots {
  public static void main(String[] args) {
    PerformingDog d = new PerformingDog();
    Robot r = new Robot();
    Communicate.perform(d);
    Communicate.perform(r);
  }
} /* Output:
Woof!
Sitting
Click!
Clank!
*///:~
