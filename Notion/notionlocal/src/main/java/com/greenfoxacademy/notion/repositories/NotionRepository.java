package com.greenfoxacademy.notion.repositories;

import com.greenfoxacademy.notion.models.Notion;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NotionRepository extends CrudRepository<Notion, Integer> {
}
