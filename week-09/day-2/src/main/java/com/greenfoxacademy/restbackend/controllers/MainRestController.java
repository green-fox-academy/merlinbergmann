package com.greenfoxacademy.restbackend.controllers;

import com.greenfoxacademy.restbackend.models.*;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

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

  @GetMapping("/appenda/{appendable}")
  public Object appendA(@PathVariable(value = "appendable") String appendable) {
    if (appendable == null) {
      throw new ResourceNotFoundException();
    } else {
      return new AppendA(appendable);
    }

  }

}
