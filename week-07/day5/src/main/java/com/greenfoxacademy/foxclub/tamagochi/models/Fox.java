package com.greenfoxacademy.foxclub.tamagochi.models;

import java.util.ArrayList;
import java.util.List;

public class Fox {

  private String name;
  private List<String> listOfTricks;
  private int food;
  private int water;

  public Fox() {
    listOfTricks = new ArrayList<>();
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public List<String> getListOfTricks() {
    return listOfTricks;
  }

  public void addTrick(String trick) {
    listOfTricks.add(trick);
  }
}
/*
create a Fox.class
it should represent a virtual fox
it should have at least the followings: name, list of tricks, food and drink
consider using more classes or enums
add a new Fox (created with the received name) to a list of Foxes
find the actual fox based on the name and send it to the template model
use Thymeleaf to replace the data
if the fox does not know any tricks yet, display a message instead of an empty list
if the fox's name is Mr. Green, eats salad, drinks water and knows 0 trick, the updated information view should represent that
 */