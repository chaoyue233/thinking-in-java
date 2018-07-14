//: initialization/OverloadingVarargs2.java
// {CompileTimeError} (Won't compile)
package com.chaoyue.thinkingInJava.initialization;
public class OverloadingVarargs2 {
  static void f(float i, Character... args) {
    System.out.println("first");
  }
  static void f(Character... args) {
    System.out.print("second");
  }
  public static void main(String[] args) {
    f(1, 'a');
    //f('a', 'b');
  }
} ///:~
