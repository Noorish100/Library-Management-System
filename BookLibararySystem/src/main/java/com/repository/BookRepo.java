package com.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.Entity.Author;
import com.Entity.Book;

public interface BookRepo extends JpaRepository<Book, Integer> {
	
	
//	@Query(value = "SELECT * FROM Book b WHERE b.title = :title", nativeQuery = true)
    List<Book> findByTitle(String title);
    List<Book> findByAuthor(Author author);
    
    
    @Query(value ="Select * from Book b  inner join Author a on b.author_author_id=a.author_id where b.title=:title And a.name=:name",nativeQuery = true)
    List<Book> findByTitleAndName(String title,String name);
	

}
