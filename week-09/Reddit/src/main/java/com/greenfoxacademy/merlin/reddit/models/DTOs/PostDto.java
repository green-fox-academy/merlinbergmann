package com.greenfoxacademy.merlin.reddit.models.DTOs;

import java.net.URL;

public class PostDto implements ResponseDto {

  private int id;
  private String title;
  private String content;
  private URL url;
  private int score;

  public PostDto() {
  }

  public PostDto(String title, String content, URL url) {

    this.title = title;
    this.content = content;
    this.url = url;
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

  public URL getUrl() {
    return url;
  }

  public void setUrl(URL url) {
    this.url = url;
  }

  public int getScore() {
    return score;
  }

  public void setScore(int score) {
    this.score = score;
  }
}
