package com.greenfoxacademy.todoapp.repositories;

import com.greenfoxacademy.todoapp.models.ToDo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TodoRepository extends CrudRepository<ToDo, Integer> {
}
