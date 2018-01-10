package com.bankofsimba.thymeleaf.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.concurrent.atomic.AtomicLong;


@Controller
public class HelloWebController {

  private AtomicLong id = new AtomicLong(0);

  @RequestMapping("/web/greeting")
  public String greeting(Model model, @RequestParam(name ="name")String name) {
    model.addAttribute("name", name);
    model.addAttribute("id", id.getAndIncrement());
    return "greeting";
  }
}
