package com.greenfoxacademy.notion.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
public class User {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;
  private String userName;

  @OneToMany
  private List<Notion> userNotions;

  public User() {
  }

  public User(String userName) {
    this.userName = userName;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  public List<Notion> getUserNotions() {
    return userNotions;
  }

  public void setUserNotions(List<Notion> userNotions) {
    this.userNotions = userNotions;
  }
}
