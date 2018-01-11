package com.greenfox.workshop.colorplay.models;

import com.greenfox.workshop.colorplay.interfaces.MyColor;
import org.springframework.stereotype.Component;

@Component
public class GreenColor implements MyColor {
  @Override
  public void printColor() {
    System.out.println("It is in green colour...");
  }
}
