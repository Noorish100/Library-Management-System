package com.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.Entity.Book;

public interface BookRepo extends JpaRepository<Book, Integer> {
	
	
//	@Query(value = "SELECT * FROM Book b WHERE b.title = :title", nativeQuery = true)
    List<Book> findByTitle(String title);
	

}
