package com.greenfoxacademy.merlin.reddit.services;


import com.greenfoxacademy.merlin.reddit.models.DTOs.OwnerDto;
import com.greenfoxacademy.merlin.reddit.models.entities.Owner;
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
}
