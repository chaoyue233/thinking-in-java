package com.chaoyue.thinkingInJava.generics;

import com.chaoyue.thinkingInJava.net.mindview.util.*;
import com.chaoyue.thinkingInJava.typeinfo.pets.*;

import java.util.List;
import java.util.Map;

public class ExplicitTypeSpecification {
  static void f(Map<Person, List<Pet>> petPeople) {}
  public static void main(String[] args) {
    f(New.<Person, List<Pet>>map());
  }
} ///:~
