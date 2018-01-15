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
		todoRepository.deleteAll();
		todoRepository.save(new ToDo("daily task"));
		todoRepository.save(new ToDo("make the beds"));
		todoRepository.save(new ToDo("do the washing up"));
		todoRepository.save(new ToDo("clean the bathroom and the kitchen"));
		todoRepository.save(new ToDo("clean the bathroom"));
		todoRepository.save(new ToDo("wipe all the surfaces with a cloth"));

	}
}
