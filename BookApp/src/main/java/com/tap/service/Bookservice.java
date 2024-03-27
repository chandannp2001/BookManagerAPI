package com.tap.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.tap.entity.Book;
import com.tap.repo.BookRepo;

@Component
public class Bookservice {

	@Autowired
	BookRepo br;
	
	public List<Book> getAllBooks() {
		List<Book> list = (List<Book>) br.findAll();
		return list;
	}
	
	public Book getBookById(int id) {
		return  br.findById(id);
	}
	
	public void insertBook(Book b) {
		  br.save(b);
	}
	
	public String updateBook(int id , Book b) {
		Book b1 = br.findById(id);
		b1.setBook_name(b.getBook_name());
		b1.setBook_author(b.getBook_author());
		br.save(b1);
		return "Book Updated";
		
	}
	public String deleteBookById(int id) {
		Book b = br.findById(id);
		br.delete(b);
		return "Book deleted";
	}
	
	
}
