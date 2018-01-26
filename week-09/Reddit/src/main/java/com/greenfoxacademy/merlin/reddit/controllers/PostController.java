package com.greenfoxacademy.merlin.reddit.controllers;

import com.greenfoxacademy.merlin.reddit.models.DTOs.PostDto;
import com.greenfoxacademy.merlin.reddit.models.DTOs.ResponseDto;
import com.greenfoxacademy.merlin.reddit.models.DTOs.ResultMessage;
import com.greenfoxacademy.merlin.reddit.models.entities.Post;
import com.greenfoxacademy.merlin.reddit.services.OwnerService;
import com.greenfoxacademy.merlin.reddit.services.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PostController {

  @Autowired
  PostService postService;
  @Autowired
  OwnerService ownerService;

  @GetMapping("/posts")
  public ResponseEntity<?> getPosts(@RequestParam(value = "score", required = false)int score) {
    List<PostDto> topPosts = postService.getPosts(score);
    return ResponseEntity.ok().body(topPosts);
  }

  @PostMapping("/{ownerId}/post")
  public ResponseEntity<ResponseDto> createPost(
          @PathVariable(value = "ownerId") int ownerId,
          @RequestBody Post post,
          BindingResult bindingResult) {
    if (bindingResult.hasErrors()) {
      return ResponseEntity.badRequest().body(new ResultMessage("Error"));
    }
    if (ownerService.addPost(ownerId, post)) {
      return ResponseEntity.ok().body(new ResultMessage("Success"));
    }
    return ResponseEntity.badRequest().body(new ResultMessage("Error"));
  }

}
