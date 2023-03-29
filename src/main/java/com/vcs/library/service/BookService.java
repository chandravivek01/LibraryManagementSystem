package com.vcs.library.service;

import java.util.List;

import com.vcs.library.entity.Book;

public interface BookService {
	
	public Book viewBookById(int id);
	
	public List<Book> viewAllBooks();
	
	public void insertBook(Book book);
	
	public void updateBook(Book book);
	
	public void deleteBookById(int id);

}
