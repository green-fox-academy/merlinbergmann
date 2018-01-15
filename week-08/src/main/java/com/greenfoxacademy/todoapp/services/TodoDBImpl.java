package com.greenfoxacademy.todoapp.services;

import com.greenfoxacademy.todoapp.models.ToDo;
import com.greenfoxacademy.todoapp.repositories.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class TodoDBImpl implements TodoService {

  @Autowired
  TodoRepository todoRepository;

  @Override
  public List<ToDo> getAllTodos(int id) {
    return todoRepository.findOne(id);
  }

  @Override
  public ToDo getToDo(int id) {
    return null;
  }
}
