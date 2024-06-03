package com.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Entity.Author;

public interface AuthorRepo extends JpaRepository<Author,Integer> {
	
	List<Author> findByBirthDateGreaterThan(Date birthYear);
	
//	Author findByAuthorId(Integer authorId);

}
