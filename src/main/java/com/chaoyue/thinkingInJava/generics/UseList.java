package com.chaoyue.thinkingInJava.generics;
// {CompileTimeError} (Won't compile)

import java.util.List;

public class UseList<W,T> {
  // {CompileTimeError} (Won't compile)
  //void f(List<T> v) {}

  void f(List<W> v) {}
} ///:~
