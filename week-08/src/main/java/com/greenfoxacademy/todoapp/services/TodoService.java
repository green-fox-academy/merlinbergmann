package com.greenfoxacademy.todoapp.services;

import com.greenfoxacademy.todoapp.models.ToDo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface TodoService {

  List<ToDo> getAllTodos();
  ToDo getToDo(int id);


}
