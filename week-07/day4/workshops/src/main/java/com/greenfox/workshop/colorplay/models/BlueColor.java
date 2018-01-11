package com.greenfox.workshop.colorplay.models;

import com.greenfox.workshop.colorplay.interfaces.MyColor;
import org.springframework.stereotype.Service;


public class BlueColor implements MyColor {
  @Override
  public void printColor() {
    System.out.println("It is in blue colour...");
  }
}
