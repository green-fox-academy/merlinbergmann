package com.greenfox.workshop.colorplay;

import com.greenfox.workshop.colorplay.interfaces.MyColor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ColorplayApplication implements CommandLineRunner {

	@Autowired
	MyColor myColor;

	public static void main(String[] args) {
		SpringApplication.run(ColorplayApplication.class, args);
	}

  @Override
  public void run(String... args) throws Exception {
    myColor.printColor();
  }
}
