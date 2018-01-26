package com.greenfoxacademy.merlin.reddit.models.DTOs;

import org.springframework.http.ResponseEntity;

public class ResultMessage implements ResponseDto {

  private String status;

  public ResultMessage() {
  }

  public ResultMessage(String status) {
    this.status = status;
  }

  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }
}
