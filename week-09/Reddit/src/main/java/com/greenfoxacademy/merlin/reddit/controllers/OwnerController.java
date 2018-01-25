package com.greenfoxacademy.merlin.reddit.controllers;

import com.greenfoxacademy.merlin.reddit.models.DTOs.OwnerDto;
import com.greenfoxacademy.merlin.reddit.models.DTOs.ResultMessage;
import com.greenfoxacademy.merlin.reddit.services.OwnerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OwnerController {

  @Autowired
  OwnerService ownerService;

  @PostMapping("/register")
  public ResponseEntity<ResultMessage> register(@RequestBody OwnerDto ownerDto) {
    if (ownerService.register(ownerDto)) {
      return ResponseEntity.status(201).body(new ResultMessage("User created"));
    }
    return ResponseEntity.badRequest().body(new ResultMessage("Some error happened."));
  }
}
