package com.greenfoxacademy.notion.models;


import lombok.Builder;

import javax.persistence.*;


@Entity
@Table(name = "notions_data")
public class Notion {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;
  private String title;
  private String content;
  @Column(name = "voting",columnDefinition = "default '0'")
  private int voting;



  public Notion() {

  }

  public Notion(String title, String content) {
    this.title = title;
    this.content = content;

  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }

  public int getVoting() {
    return voting;
  }

  public void setVoting(int voting) {
    this.voting = voting;
  }

  public void increaseVoting() {
    voting ++;
  }

  public void decreaseVoting() {
    voting --;
  }

  }
