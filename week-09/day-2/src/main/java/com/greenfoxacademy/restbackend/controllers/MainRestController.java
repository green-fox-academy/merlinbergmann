package com.greenfoxacademy.restbackend.controllers;

import com.greenfoxacademy.restbackend.models.Doubling;
import com.greenfoxacademy.restbackend.models.ErrorResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainRestController {

  @GetMapping("/doubling")
  public Object doubleThis(@RequestParam(value = "input", required = false) Integer input) {
    if (input == null) {
      return new ErrorResponse("Please provide an input!");
    } else {
      return new Doubling(input);
    }

  }

}
