package com.greenfoxacademy.merlin.reddit.services;

import com.greenfoxacademy.merlin.reddit.models.entities.Owner;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OwnerRepository extends CrudRepository<Owner, Integer> {

  Owner findByName(String postOwner);
}
