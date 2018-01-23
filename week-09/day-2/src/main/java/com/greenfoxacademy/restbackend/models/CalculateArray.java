package com.greenfoxacademy.restbackend.models;

import java.util.ArrayList;
import java.util.List;

public class CalculateArray {

  private String result;

  public CalculateArray() {
  }

  public CalculateArray(String operator, CalcArray calcArray) {
    if (operator.equalsIgnoreCase("sum")) {
      int temp = 0;
      for (int i = 0; i < calcArray.getNumbers().length; i++) {
       temp += calcArray.getNumbers()[i];

      } this.result = Integer.toString(temp);

    } else if (operator.equalsIgnoreCase("multiply")) {
      int temp = 1;
      for (int i = 0; i < calcArray.getNumbers().length ; i++) {
        temp *= calcArray.getNumbers()[i];

      } this.result = Integer.toString(temp);

    } else if (operator.equalsIgnoreCase("double")) {
        List<Integer> temp = new ArrayList<>();
      for (int i = 0; i < calcArray.getNumbers().length; i++) {
        temp.add(calcArray.getNumbers()[i] * 2);
      } this.result = temp.toString();
    }
  }

  public String getResult() {
    return result;
  }

  public void setResult(String result) {
    this.result = result;
  }
}
