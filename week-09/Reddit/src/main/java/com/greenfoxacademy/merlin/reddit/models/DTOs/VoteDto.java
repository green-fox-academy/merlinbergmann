package com.greenfoxacademy.merlin.reddit.models.DTOs;

import com.greenfoxacademy.merlin.reddit.models.entities.Owner;
import com.greenfoxacademy.merlin.reddit.models.entities.Post;

import java.net.MalformedURLException;
import java.net.URL;

public class VoteDto implements ResponseDto {
  private int id;
  private String title;
  private URL url;
  private Long timestamp;
  private int score;
  private String owner;
  private int vote;

  public VoteDto() {
  }

  public VoteDto(Post post, Owner owner) throws MalformedURLException {
    this.id = post.getId();
    this.title = post.getTitle();
    this.url = new URL("http://localhost:8080/posts/" + post.getId() + "/upvote?username=" + owner.getName());
    this.timestamp = post.getTimestamp();
    this.score = post.getScore();
    this.owner = owner.getName();
    this.vote = post.getVotes().size();
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

  public String getOwner() {
    return owner;
  }

  public void setOwner(String owner) {
    this.owner = owner;
  }

  public int getVote() {
    return vote;
  }

  public void setVote(int vote) {
    this.vote = vote;
  }
}
