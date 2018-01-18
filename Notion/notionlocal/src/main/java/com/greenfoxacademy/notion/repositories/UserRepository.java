package com.greenfoxacademy.notion.repositories;

import com.greenfoxacademy.notion.models.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Integer> {
}
