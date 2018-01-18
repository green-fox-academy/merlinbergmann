package com.greenfoxacademy.notion.services;

import com.greenfoxacademy.notion.models.Notion;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface NotionService {

  List<Notion> getAllNotions();
//  Page<Notion> findByVotingDesc(Pageable pageable);

  Notion getNotionById(int id);
  void modifyNotion(Notion notion);
  void deleteNotion(int id);
  void addNotion(Notion notion);
  void upVoting(int notionId);
  void downVoting(int notionId);
}
