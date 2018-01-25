package com.greenfoxacademy.merlin.reddit.controllers;

import com.greenfoxacademy.merlin.reddit.models.DTOs.PostDto;
import com.greenfoxacademy.merlin.reddit.services.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PostController {

  @Autowired
  PostService postService;

  @GetMapping("/posts")
  public ResponseEntity<?> getPosts(@RequestParam(value = "score", required = false)int score) {
    List<PostDto> topPosts = postService.getPosts(score);
    return ResponseEntity.ok().body(topPosts);

  }

}
