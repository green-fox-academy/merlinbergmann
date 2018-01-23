package com.greenfoxacademy.restbackend.models;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class DoUntil {

  @JsonIgnore
  private Until until;
  private int result;

  public DoUntil() {
  }

  public DoUntil(Until until) {
    this.until = until;
  }

  public DoUntil(String operator, Until until) {
    this.until = until;
    if (operator.equalsIgnoreCase("sum")) {
      for (int i = 1; i <= until.getUntil(); i++) {
        this.result += i;
      }
    } else if (operator.equalsIgnoreCase("factor")) {
      this.result = 1;
      for (int i = 1; i <= until.getUntil(); i++) {
        this.result *= i;
      }
    }
  }

  public Until getUntil() {
    return until;
  }

  public void setUntil(Until until) {
    this.until = until;
  }

  public int getResult() {
    return result;
  }

  public void setResult(int result) {
    this.result = result;
  }
}