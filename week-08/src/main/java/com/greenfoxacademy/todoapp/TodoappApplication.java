package com.greenfoxacademy.todoapp;

import com.greenfoxacademy.todoapp.models.ToDo;
import com.greenfoxacademy.todoapp.repositories.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TodoappApplication implements CommandLineRunner {

	@Autowired
	TodoRepository todoRepository;

	public static void main(String[] args) {
		SpringApplication.run(TodoappApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		todoRepository.save(new ToDo("First Task"));
		todoRepository.save(new ToDo("Second Task"));
	}
}
