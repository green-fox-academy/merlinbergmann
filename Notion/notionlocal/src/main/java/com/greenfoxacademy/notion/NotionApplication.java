package com.greenfoxacademy.notion;

import com.greenfoxacademy.notion.services.NotionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class NotionApplication {

	public static void main(String[] args) {
		SpringApplication.run(NotionApplication.class, args);
	}

}
