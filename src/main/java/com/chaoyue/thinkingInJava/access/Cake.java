//: access/Cake.java
// Accesses a class in a separate compilation unit.
package com.chaoyue.thinkingInJava.access;
class Cake {
  public static void main(String[] args) {
    Pie x = new Pie();
    x.f();
  }
} /* Output:
Pie.f()
*///:~
