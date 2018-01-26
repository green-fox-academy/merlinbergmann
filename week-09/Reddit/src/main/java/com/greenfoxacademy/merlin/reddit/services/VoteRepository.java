package com.greenfoxacademy.merlin.reddit.services;

import com.greenfoxacademy.merlin.reddit.models.entities.Owner;
import com.greenfoxacademy.merlin.reddit.models.entities.Post;
import com.greenfoxacademy.merlin.reddit.models.entities.Vote;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VoteRepository extends CrudRepository<Vote, Integer> {
  Vote findByPostAndOwner(Post post, Owner owner);
}
