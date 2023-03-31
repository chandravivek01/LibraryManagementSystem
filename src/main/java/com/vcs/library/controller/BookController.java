package com.vcs.library.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.vcs.library.entity.Book;
import com.vcs.library.service.BookService;

@Controller
@RequestMapping("/books")
public class BookController {

	/*
	 * 		/books/save - 
	 */
	
	@Autowired
	private BookService bookService;
	
	@GetMapping("/showFormForAdd")
	public String showFormForAdd(Model model) {
		Book book = new Book();
		model.addAttribute("book", book);
		return "books/book-form";
	}
	
	@GetMapping("/list")
	public String listBooks(Model model) {
		
		List<Book> books = bookService.viewAllBooks();
		model.addAttribute("books",books);
		
		return "books/list-books";
	}
	
	@PostMapping("/save")
	public String saveBook(@ModelAttribute("book") Book book) {
		
		bookService.insertBook(book);
		return "redirect:/books/list";
	}
	
	@PostMapping("/showFormForUpdate")
	public String showFormForUpdate(@RequestParam("bookId") int id, Model model) {
		Book book = bookService.viewBookById(id);
		model.addAttribute("book", book);
		return "books/book-form";
	}
	
	@PostMapping("/delete")
	public String deleteBook(@RequestParam("bookId") int id) {
		bookService.deleteBookById(id);
		return "redirect:/books/list";
	}
	
}
