package com.vcs.library;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication //(scanBasePackages = {"com.vcs.library.*"})
public class LibraryManagementSystem {

	public static void main(String[] args) {
		SpringApplication.run(LibraryManagementSystem.class, args);
		System.out.println("Hello!!");
	}

}
