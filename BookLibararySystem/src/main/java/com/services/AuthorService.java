package com.services;

import java.sql.Date;
import java.time.LocalDateTime;
import java.util.List;

import com.Entity.Author;
import com.exception.GlobalException;


public interface AuthorService {
	
     List<Author> retriveAllAuthor();
     
     List<Author> AllbornAfter(Date t);

}
