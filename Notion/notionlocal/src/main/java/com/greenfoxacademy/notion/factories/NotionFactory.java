package com.greenfoxacademy.notion.factories;

import com.greenfoxacademy.notion.models.Notion;
import org.springframework.stereotype.Component;

@Component
public class NotionFactory {

  public Notion getEmptyNotion() {
    return new Notion();
  }
}
