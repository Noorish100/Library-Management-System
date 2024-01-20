package com.services;

import java.sql.Date;
import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Entity.Author;
import com.repository.AuthorRepo;


@Service
public class AuthorImpl implements AuthorService {

	
	@Autowired
	private AuthorRepo authorRepo;
	
	@Override
	public List<Author> retriveAllAuthor() {
		
		return authorRepo.findAll();
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Author> AllbornAfter(Date t) {
		// TODO Auto-generated method stub
		return null;
	}



}
