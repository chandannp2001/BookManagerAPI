package com.tap.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.tap.entity.Book;
import com.tap.service.Bookservice;

@RestController
public class BookController {

	@Autowired
	Bookservice bs;
	
	
	@GetMapping("/books")
	public List<Book> getAllBooks() {
		return bs.getAllBooks();  
	}
	
	@GetMapping("/books/{id}")
	public Book getBookId(@PathVariable("id") int id) {
		return bs.getBookById(id);
	}
	
	@PostMapping("/book")
	public String insertBook(@RequestBody Book b) {
		bs.insertBook(b);
		return "book Inserted";
	}
	
	@PutMapping("books/i{id}")
	public String updateBook(@PathVariable("id") int id, @RequestBody Book b) {
		return bs.updateBook(id, b);
		
	}
	
	@DeleteMapping("books/{id}")
	public String DeleteBook(@PathVariable("id") int id) {
		return bs.deleteBookById(id); 
	}
}
