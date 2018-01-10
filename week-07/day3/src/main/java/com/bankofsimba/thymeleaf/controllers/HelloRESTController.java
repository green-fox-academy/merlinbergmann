package com.bankofsimba.thymeleaf.controllers;

import com.bankofsimba.thymeleaf.models.Greeting;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class HelloRESTController {

  private AtomicLong id = new AtomicLong(0);

  @RequestMapping("/hello")
  public String greeting() {
    return "Hi!";
  }

  @RequestMapping("/greeting")
  public Greeting greet(@RequestParam(name ="name")String name) {

    Greeting greetings = new Greeting(id.getAndIncrement() , "Hello my friend " + name);
    return greetings;
  }
}
