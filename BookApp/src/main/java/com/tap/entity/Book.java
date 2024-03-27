package com.tap.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "book")
public class Book {
	@Id
	@Column(name = "bid")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int bId;
	
	@Column(name = "book_name")
	private String book_name;
	
	@Column(name = "book_author")
	private String book_author;

	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Book( String book_name, String book_author) {
		super();
		
		this.book_name = book_name;
		this.book_author = book_author;
	}

	public int getbId() {
		return bId;
	}

	public void setbId(int bId) {
		this.bId = bId;
	}

	public String getBook_name() {
		return book_name;
	}

	public void setBook_name(String book_name) {
		this.book_name = book_name;
	}

	public String getBook_author() {
		return book_author;
	}

	public void setBook_author(String book_author) {
		this.book_author = book_author;
	}

	@Override
	public String toString() {
		return "Book [bId=" + bId + ", book_name=" + book_name + ", book_author=" + book_author + "]";
	}
	
	

}
