package com.greenfoxacademy.todoapp.services;

import com.greenfoxacademy.todoapp.models.ToDo;

import java.util.List;

public class TodoFileService implements TodoService {
  @Override
  public List<ToDo> getAllTodos() {
    return null;
  }

  @Override
  public ToDo getToDo(int id) {
    return null;
  }

  @Override
  public void modifyTodo(ToDo todo) {

  }

  @Override
  public void create(ToDo todo) {

  }

  @Override
  public void makeUrgent(int id, boolean urgent) {

  }

  @Override
  public void isDone(int id, boolean done) {

  }

  @Override
  public void delete(int id) {

  }
}
