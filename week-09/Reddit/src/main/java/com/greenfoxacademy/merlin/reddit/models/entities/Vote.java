package com.greenfoxacademy.merlin.reddit.models.entities;

import javax.persistence.*;

@Entity
@Table
public class Vote {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private int id;

  @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.MERGE)
  @JoinColumn(name = "owner_Id")
  private Owner owner;

  @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.MERGE)
  @JoinColumn(name = "post_Id")
  private Post post;

  private int vote;

  public Vote() {
  }

  public Vote(Owner owner, Post post, int vote) {
    this.owner = owner;
    this.post = post;
    this.vote = vote;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public Owner getOwner() {
    return owner;
  }

  public void setOwner(Owner owner) {
    this.owner = owner;
  }

  public Post getPost() {
    return post;
  }

  public void setPost(Post post) {
    this.post = post;
  }

  public int getVote() {
    return vote;
  }

  public void setVote(int vote) {
    this.vote = vote;
  }
}
