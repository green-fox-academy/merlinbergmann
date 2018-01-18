package com.greenfoxacademy.notion.services;

import com.greenfoxacademy.notion.models.Notion;
import com.greenfoxacademy.notion.repositories.NotionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NotionServiceImpl implements NotionService {

  @Autowired
  NotionRepository notionRepository;

 /* @Override
  public Page<Notion> findByVotingDesc(Pageable pageable) {
  Page<Notion> notionList = notionRepository.;
  }
*/
  @Override
  public List<Notion> getAllNotions() {
    return (List<Notion>) notionRepository.findAll();
  }

  @Override
  public Notion getNotionById(int id) {
    return notionRepository.findOne(id);
  }

  @Override
  public void modifyNotion(Notion notion) {
    notionRepository.save(notion);
  }

  @Override
  public void deleteNotion(int id) {
    notionRepository.delete(id);
  }

  @Override
  public void addNotion(Notion notion) {
    notionRepository.save(notion);
  }

  @Override
  public void upVoting(int notionId) {
    notionRepository.findOne(notionId).increaseVoting();
  }

  @Override
  public void downVoting(int notionId) {
    notionRepository.findOne(notionId).decreaseVoting();
  }
}
