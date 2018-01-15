package com.greenfoxacademy.todoapp.repositories;

import com.greenfoxacademy.todoapp.models.ToDo;
import org.springframework.data.repository.CrudRepository;

public interface TodoRepository extends CrudRepository<ToDo, Integer> {
}
