package com.services;



import java.util.Date;
import java.util.List;

import com.Entity.Author;



public interface AuthorService {
	
     List<Author> retriveAllAuthor();
     
     List<Author> AllbornAfter(Date t);

}
