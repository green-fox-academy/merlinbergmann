package com.greenfoxacademy.merlin.reddit.models.DTOs;

public class OwnerDto {

  private String name;

  public OwnerDto() {

  }

  public OwnerDto(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}
