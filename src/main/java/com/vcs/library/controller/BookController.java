package com.vcs.library.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/books")
public class BookController {

	@GetMapping("/showFormForAdd")
	public String showFormForAdd(Model model) {
		return "books/book-form";
	}
	
	@GetMapping("/list")
	public String listBooks(Model model) {
		return "books/list-books";
	}
	
	
	
}
