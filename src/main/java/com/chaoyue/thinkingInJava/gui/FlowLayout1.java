package com.chaoyue.thinkingInJava.gui;
// Demonstrates FlowLayout.

import javax.swing.*;
import java.awt.*;

import static com.chaoyue.thinkingInJava.net.mindview.util.SwingConsole.*;
import static com.chaoyue.thinkingInJava.net.mindview.util.SwingConsole.run;

public class FlowLayout1 extends JFrame {
  public FlowLayout1() {
    setLayout(new FlowLayout());
    for(int i = 0; i < 20; i++)
      add(new JButton("Button " + i));
  }
  public static void main(String[] args) {
    run(new FlowLayout1(), 300, 300);
  }
} ///:~
