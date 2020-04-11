package com.epam;

import java.util.List;
import java.util.Optional;

public interface BookDAO {
	
	List<Book> findAll();
	
	List<Book> findAllByDate(String date);
	
	Optional<Book> findById(int bookId);
	
	Integer create(Book book);
	
	Integer update(Book book);
	
	Integer delete(Integer id);
	
}
