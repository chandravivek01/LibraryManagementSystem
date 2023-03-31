package com.vcs.library.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vcs.library.dao.BookRepository;
import com.vcs.library.entity.Book;

@Service
public class BookServiceImpl implements BookService {
	
	@Autowired
	private BookRepository bookRepository;

	@Override
	public Book viewBookById(int id) {
		return bookRepository.findById(id).get();
	}

	@Override
	public List<Book> viewAllBooks() {
		List<Book> books = bookRepository.findAll();
		return books;
	}

	@Override
	public void insertBook(Book book) {

			bookRepository.save(book);
	}

	@Override
	public void updateBook(Book book) {


	}

	@Override
	public void deleteBookById(int id) {
	
		bookRepository.deleteById(id);
	}

}
