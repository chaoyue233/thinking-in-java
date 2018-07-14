//: polymorphism/shape/Square.java
package com.chaoyue.thinkingInJava.polymorphism.shape;
import static com.chaoyue.thinkingInJava.net.mindview.util.Print.*;
import static com.chaoyue.thinkingInJava.net.mindview.util.Print.print;

public class Square extends Shape {
  public void draw() { print("Square.draw()"); }
  public void erase() { print("Square.erase()"); }
} ///:~
