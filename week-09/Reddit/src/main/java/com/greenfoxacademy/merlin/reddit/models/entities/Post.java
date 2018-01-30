package com.greenfoxacademy.merlin.reddit.models.entities;

import javax.persistence.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Post {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private int id;
  private String title;
  private String content;
  private URL url;
  private Long timestamp;
  private int score;

  @OneToOne
  @JoinColumn(name = "owner_id")
  private Owner owner;

  @OneToMany
  private List<Vote> votes;

  public Post() {
    timestamp = System.currentTimeMillis() / 1000;
    votes = new ArrayList<>();
  }

  public Post(String title, String content, URL url) {
    timestamp = System.currentTimeMillis() / 1000;
    votes = new ArrayList<>();
    this.title = title;
    this.content = content;
    this.url = url;
  }

  public Post(String title, String content)
          throws MalformedURLException {
    timestamp = System.currentTimeMillis() / 1000;
    this.url = new URL("http://9gag.com/");
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

  public URL getUrl() {
    return url;
  }

  public void setUrl(URL url) {
    this.url = url;
  }

  public Long getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(Long timestamp) {
    this.timestamp = timestamp;
  }

  public int getScore() {
    return score;
  }

  public void setScore(int score) {
    this.score = score;
  }

  public Owner getOwner() {
    return owner;
  }

  public void setOwner(Owner owner) {
    this.owner = owner;
  }

  public List<Vote> getVotes() {
    return votes;
  }

  public void setVotes(List<Vote> votes) {
    this.votes = votes;
  }
}
