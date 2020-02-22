package com.cat.springbootStarter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CourseApiApp {

	public static void main(String[] args) {
		System.out.println("I am in from CourseApiApp class");
		SpringApplication.run(CourseApiApp.class, args);

	}

}
