package com.greenfoxacademy.merlin.reddit.services;

import com.greenfoxacademy.merlin.reddit.models.entities.Owner;
import com.greenfoxacademy.merlin.reddit.models.entities.Post;
import com.greenfoxacademy.merlin.reddit.models.entities.Vote;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VoteService {

  @Autowired
  VoteRepository voteRepository;

  public void save(Vote vote) {
    voteRepository.save(vote);
  }
  public void delete(Vote vote) {
    voteRepository.delete(vote.getId());
  }
  public Vote findByPostAndOwner(Post post, Owner owner) {
    return voteRepository.findByPostAndOwner(post, owner);
  }
}
