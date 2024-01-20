package com.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Entity.Author;

public interface AuthorRepo extends JpaRepository<Author,Integer> {

}
