package com.greenfoxacademy.restbackend.controllers;

import com.greenfoxacademy.restbackend.models.Doubling;
import com.greenfoxacademy.restbackend.models.ErrorResponse;
import com.greenfoxacademy.restbackend.models.Greeting;
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

  @GetMapping("/greeter")
  public Object greetThis(@RequestParam(value = "name", required = false) String name
                            , @RequestParam(value = "title", required = false) String title) {
    if (name == null) {
      return new ErrorResponse("Please provide a name!");
    } else if (title == null) {
      return new ErrorResponse("Please provide a title!");
    } else {
      return new Greeting(name, title);
    }

  }

}
