package com.chaoyue.thinkingInJava.generics;

import com.chaoyue.thinkingInJava.net.mindview.util.*;
import com.chaoyue.thinkingInJava.typeinfo.pets.*;

import java.util.List;
import java.util.Map;

public class SimplerPets {
  public static void main(String[] args) {
    Map<Person, List<? extends Pet>> petPeople = New.map();
    // Rest of the code is the same...
  }
} ///:~
