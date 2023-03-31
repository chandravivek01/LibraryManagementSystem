package com.vcs.library.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vcs.library.entity.Book;

public interface BookRepository extends JpaRepository<Book, Integer> {

}
