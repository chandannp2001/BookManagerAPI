package com.tap.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import com.tap.entity.Book;

@Component
public interface BookRepo extends CrudRepository<Book, Integer> {

	Book findById(int id);
}
