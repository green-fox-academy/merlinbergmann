package com.greenfoxacademy.merlin.reddit.services;


import com.greenfoxacademy.merlin.reddit.models.DTOs.OwnerDto;
import com.greenfoxacademy.merlin.reddit.models.entities.Owner;
import com.greenfoxacademy.merlin.reddit.models.entities.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OwnerService {

  @Autowired
  OwnerRepository ownerRepository;
  @Autowired
  PostService postService;

  public boolean register(OwnerDto ownerDto) {
    Owner owner = convertOwnerDTOToEntity(ownerDto);
    ownerRepository.save(owner);
    return true;
  }

  private Owner convertOwnerDTOToEntity(OwnerDto ownerDto) {
    Owner owner = new Owner(ownerDto.getName());
    return owner;
  }

  public boolean addPost(int ownerId, Post post) {
    Owner owner = ownerRepository.findOne(ownerId);
    owner.addPost(post);
    postService.createPost(post);
    return true;
  }
}
