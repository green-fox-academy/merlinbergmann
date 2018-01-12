package com.greenfoxacademy.foxclub.tamagochi.services;

import com.greenfoxacademy.foxclub.tamagochi.models.Fox;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FoxService {

  private List<Fox> foxes;

  public FoxService() {
    foxes = new ArrayList<>();
  }

  public Fox login(Fox fox) {
    if (!foxes.contains(fox)) {
      register(fox);
      return fox;
    }
    return fox;
  }

  private void register(Fox fox) {
    foxes.add(fox);
  }

  public Fox findOne(String foxName) {
    for (Fox fox : foxes) {
      if (fox.getName().equals(foxName)) {
        return fox;
      }
    }
    Fox fox = new Fox();
    fox.setName(foxName);
    register(fox);
    return fox;
  }
}
