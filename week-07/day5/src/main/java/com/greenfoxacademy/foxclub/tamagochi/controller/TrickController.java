package com.greenfoxacademy.foxclub.tamagochi.controller;

import com.greenfoxacademy.foxclub.tamagochi.factories.TrickFactory;
import com.greenfoxacademy.foxclub.tamagochi.services.FoxService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class TrickController {

  FoxService foxService;
  TrickFactory trickFactory;

  @Autowired
  public TrickController(FoxService foxService, TrickFactory trickFactory) {
    this.foxService = foxService;
    this.trickFactory = trickFactory;
  }

  @GetMapping("/foxes/{foxName}/tricks")
  public String showTrickPage(Model model, @PathVariable String foxName) {
    model.addAttribute("task",)
  }
}
