package com.greenfoxacademy.restbackend.models;

public class AppendA {

  public String appended;

  public AppendA(){

  }

  public AppendA(String appendThis) {
    this.appended = appendThis + "a";
  }
}
