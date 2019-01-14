package com.SnakeEyes.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SnakeEyesApplication {

	public static void main(String[] args) {
		SpringApplication.run(SnakeEyesApplication.class, args);
		System.out.println("SnakeEyes Server Started.");
	}

}

