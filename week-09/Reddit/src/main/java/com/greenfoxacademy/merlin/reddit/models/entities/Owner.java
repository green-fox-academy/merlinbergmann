package com.greenfoxacademy.merlin.reddit.models.entities;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Owner {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private int id;
  private String name;
  @OneToMany(mappedBy = "owner", cascade = CascadeType.ALL)
  private List<Post> posts;

  public Owner() {
  }

  public Owner(String name) {
    this.name = name;
    posts = new ArrayList<>();
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public List<Post> getPosts() {
    return posts;
  }

  public void setPosts(List<Post> posts) {
    this.posts = posts;
  }

  public void addPost(Post post){
    post.setOwner(this);
    posts.add(post);
  }
}
