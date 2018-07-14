//: initialization/OverloadingOrder.java
// Overloading based on the order of the arguments.
package com.chaoyue.thinkingInJava.initialization;
import static com.chaoyue.thinkingInJava.net.mindview.util.Print.*;
import static com.chaoyue.thinkingInJava.net.mindview.util.Print.print;

public class OverloadingOrder {
  static void f(String s, int i) {
    print("String: " + s + ", int: " + i);
  }
  static void f(int i, String s) {
    print("int: " + i + ", String: " + s);
  }
  public static void main(String[] args) {
    f("String first", 11);
    f(99, "Int first");
  }
} /* Output:
String: String first, int: 11
int: 99, String: Int first
*///:~
