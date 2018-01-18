package com.greenfoxacademy.notion.controllers;

import com.greenfoxacademy.notion.factories.NotionFactory;
import com.greenfoxacademy.notion.models.Notion;
import com.greenfoxacademy.notion.services.NotionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class NotionController {

  @Autowired
  NotionService notionService;
  @Autowired
  NotionFactory notionFactory;

  @GetMapping({"/notion"})
  public String showIndexPage(Model model) {
    List<Notion> notions = notionService.getAllNotions();
    model.addAttribute("notions", notions);
    return "index";
  }
/*
  @RequestMapping(value = "/notions", method = RequestMethod.GET)
  public Page<Notion> showIndexPage(Pageable pageable) {
    Page<Notion> notions = notionService.listAllByPage(pageable);
    model.addAttribute("notions", notions);
    return "index";
  }
*/
  @GetMapping({"/notion/add"})
  public String showAddPage(Model model) {
    model.addAttribute("newNotion", notionFactory.getEmptyNotion());
    return "addnotion";
  }

  @PostMapping("/post")
  public String addNotion(@ModelAttribute Notion notion) {
    notionService.addNotion(notion);
    return "redirect:/notion";
  }

  @PostMapping("/voteup")
  public String voteNotionUp(@PathVariable int notionId, @ModelAttribute Notion notion) {
    notionService.upVoting(notionId);
    return "redirect:/notion";
  }
  @PostMapping("/votedown")
  public String voteNotionDown(@PathVariable int notionId, @ModelAttribute Notion notion) {
    notionService.downVoting(notionId);
    return "redirect:/notion";
  }
}
