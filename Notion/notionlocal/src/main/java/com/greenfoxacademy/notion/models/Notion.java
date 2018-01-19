package com.greenfoxacademy.notion.models;


import javax.persistence.*;

@Entity
@Table
public class Notion {

  @Id
  @GeneratedValue(strategy =
          GenerationType.IDENTITY)
  private int id;
  private String title;
  private String content;
  @Column(name = "likes",
          columnDefinition = "int default '0'")
  private int likes;
  @Column(name = "dislikes",
          columnDefinition = "int default '0'")
  private int dislikes;

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

  public int getLikes() {
    return likes;
  }

  public void setLikes(int likes) {
    this.likes = likes;
  }

  public void increaseLikes() {
    likes++;
  }

  public int getDislikes() {
    return dislikes;
  }

  public void setDislikes(int dislikes) {
    this.dislikes = dislikes;
  }

  public void increaseDislikes() {
    dislikes++;
  }
}
