package com.greenfoxacademy.foxclub.tamagochi.controller;

import com.greenfoxacademy.foxclub.tamagochi.models.Fox;
import com.greenfoxacademy.foxclub.tamagochi.services.FoxService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {

  FoxService foxService;

  public LoginController(FoxService foxService) {
    this.foxService = foxService;
  }

  @GetMapping("/login")
  public String showLogin(Model model) {
    model.addAttribute("fox", new Fox());
    return "login";
  }

  @PostMapping("/login")
  private ModelAndView handleLogin(Model model, @ModelAttribute Fox fox) {
    Fox loggedInFox = foxService.login(fox);
    model.addAttribute("fox", loggedInFox);
    return new ModelAndView("redirect:/foxes/" + fox.getName());
  }

}
