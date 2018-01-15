package com.greenfoxacademy.todoapp.controllers;

import com.greenfoxacademy.todoapp.models.ToDo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class TodoController {

  @GetMapping("/list")
  public String list(Model model) {
    return "this is my first ToDo";
  }
}
