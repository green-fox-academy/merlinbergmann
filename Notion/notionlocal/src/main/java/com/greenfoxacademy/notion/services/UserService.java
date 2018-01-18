package com.greenfoxacademy.notion.services;

import com.greenfoxacademy.notion.models.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {

  List<User> getAllNotions();
  User getUserById(int id);
  void modifyUser(User user);
  void deleteUser(int id);
  void addUser(User user);
}
