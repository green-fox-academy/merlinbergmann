package com.greenfoxacademy.merlin.reddit.controllers;

import com.greenfoxacademy.merlin.reddit.models.DTOs.PostDto;
import com.greenfoxacademy.merlin.reddit.models.DTOs.ResponseDto;
import com.greenfoxacademy.merlin.reddit.models.DTOs.ResultMessage;
import com.greenfoxacademy.merlin.reddit.models.DTOs.VoteDto;
import com.greenfoxacademy.merlin.reddit.models.entities.Owner;
import com.greenfoxacademy.merlin.reddit.models.entities.Post;
import com.greenfoxacademy.merlin.reddit.models.entities.Vote;
import com.greenfoxacademy.merlin.reddit.services.OwnerService;
import com.greenfoxacademy.merlin.reddit.services.PostService;
import com.greenfoxacademy.merlin.reddit.services.VoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.net.MalformedURLException;
import java.util.List;

@RestController
@CrossOrigin("*")
public class PostController {

  @Autowired
  PostService postService;
  @Autowired
  OwnerService ownerService;
  @Autowired
  VoteService voteService;

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

  @PutMapping("/posts/{postId}/upvote")
  public ResponseEntity<ResponseDto> upVote(@RequestHeader(value = "owner") String postOwner,
                                            @PathVariable(value = "id") int id) throws MalformedURLException {
    Owner owner = ownerService.findByName(postOwner);
    Post post = postService.findOne(id);
    Vote vote = voteService.findByPostAndOwner(post, owner);

    if (vote == null) {
      Vote upVote = new Vote(owner, post, 1);
      voteService.save(upVote);
    } else if (vote.getVote() == -1) {
      vote.setVote(1);
      voteService.save(vote);
    } else {
      post.getVotes().remove(vote);
      voteService.delete(vote);
    }
    postService.save(post);
    return new ResponseEntity<>(new VoteDto(post, owner), HttpStatus.OK);
  }

  @PutMapping("/posts/{postId}/downvote")
  public ResponseEntity<ResponseDto> downVote(@RequestHeader(value = "owner") String postOwner,
                                            @PathVariable(value = "id") int id) throws MalformedURLException {
    Owner owner = ownerService.findByName(postOwner);
    Post post = postService.findOne(id);
    Vote vote = voteService.findByPostAndOwner(post, owner);

    if (vote == null) {
      Vote downVote = new Vote(owner, post, -1);
      voteService.save(downVote);
    } else if (vote.getVote() == 1) {
      vote.setVote(-1);
      voteService.save(vote);
    } else {
      post.getVotes().remove(vote);
      voteService.delete(vote);
    }
    postService.save(post);
    return new ResponseEntity<>(new VoteDto(post, owner), HttpStatus.OK);
  }

}
