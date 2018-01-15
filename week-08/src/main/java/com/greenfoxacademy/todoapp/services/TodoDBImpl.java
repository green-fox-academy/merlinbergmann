package com.greenfoxacademy.todoapp.services;

import com.greenfoxacademy.todoapp.models.ToDo;
import com.greenfoxacademy.todoapp.repositories.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TodoDBImpl implements TodoService {

  @Autowired
  TodoRepository todoRepository;

  @Override
  public List<ToDo> getAllTodos() {
    List<ToDo> todos = new ArrayList<>();
    todoRepository.findAll().forEach(todos::add);
    return todos;
  }

  @Override
  public ToDo getToDo(int id) {
    return todoRepository.findOne(id);
  }

  @Override
  public void modifyTodo(ToDo todo) {
    todoRepository.save(todo);
  }

  @Override
  public void create(ToDo todo) {
    todoRepository.save(todo);
  }

  @Override
  public void makeUrgent(int id, boolean urgent) {
    ToDo todo = todoRepository.findOne(id);
    todo.setUrgent(true);
  }

  @Override
  public void isDone(int id, boolean done) {
    ToDo todo = todoRepository.findOne(id);
    todo.setDone(true);
  }

  @Override
  public void delete(int id) {
    todoRepository.delete(id);
  }

  public void deleteAll(){
    todoRepository.findAll().forEach(todoRepository::delete);
  }
}
