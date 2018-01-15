package com.greenfoxacademy.todoapp.services;

import com.greenfoxacademy.todoapp.models.ToDo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface TodoService {

  List<ToDo> getAllTodos();
  ToDo getToDo(int id);
  void modifyTodo(ToDo todo);
  void create(ToDo todo);
  void makeUrgent(int id, boolean urgent);
  void isDone(int id, boolean done);
  void delete(int id);

}
