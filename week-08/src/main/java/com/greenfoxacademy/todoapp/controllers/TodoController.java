package com.greenfoxacademy.todoapp.controllers;

import com.greenfoxacademy.todoapp.models.ToDo;
import com.greenfoxacademy.todoapp.services.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/todo")
public class TodoController {

  @Autowired
  TodoService todoService;

  @GetMapping({"/", "/list"})
  public String list(Model model) {
    List<ToDo> todos = todoService.getAllTodos();
    model.addAttribute("todos", todos);
    model.addAttribute("newTodo", new ToDo());
    return "list";
  }
}
