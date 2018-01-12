package com.greenfoxacademy.foxclub.tamagochi.controller;

import com.greenfoxacademy.foxclub.tamagochi.models.Fox;
import com.greenfoxacademy.foxclub.tamagochi.services.FoxService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class FoxController {

  FoxService foxService;

  @Autowired
  public FoxController(FoxService foxService) {
    this.foxService = foxService;
  }

  @GetMapping("/foxes/{foxName}")
  public String showFoxPage(Model model, @PathVariable String foxName) {
    Fox fox = foxService.findOne(foxName);
    model.addAttribute("fox", fox);
    return "index";
  }
}
