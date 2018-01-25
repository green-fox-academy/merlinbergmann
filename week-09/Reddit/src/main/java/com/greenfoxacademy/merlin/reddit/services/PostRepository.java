package com.greenfoxacademy.merlin.reddit.services;

import com.greenfoxacademy.merlin.reddit.models.entities.Post;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PostRepository extends CrudRepository<Post, Integer> {

  List<Post> findAll();

  List<Post> findAllByScore(Integer score);
}
