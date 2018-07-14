//: annotations/Testable.java
package com.chaoyue.thinkingInJava.annotations;
import com.chaoyue.thinkingInJava.net.mindview.atunit.*;

public class Testable {
  public void execute() {
    System.out.println("Executing..");
  }
  @Test void testExecute() { execute(); }
} ///:~
