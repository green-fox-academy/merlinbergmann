package com.greenfox.workshop.colorplay.models;

import com.greenfox.workshop.colorplay.interfaces.MyColor;

public class RedColor implements MyColor {
  @Override
  public void printColor() {
    System.out.println("It is red in colour...");
  }
}
