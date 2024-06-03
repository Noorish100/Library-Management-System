package com.services;

import java.nio.file.attribute.UserPrincipalNotFoundException;
import java.util.List;

import com.Entity.Author;
import com.Entity.Book;
import com.Entity.DTO;

public interface BookService {
	
	 List<DTO>	retriveAllBook();
	 
     String addBook(Book b) throws NoSuchFieldException;
     
    DTO getBookById(int id)throws NoSuchFieldException;
    
    String delBookById(int id)throws NoSuchFieldException;
    
    Book updateBookById(int id)throws NoSuchFieldException;
    
    List<Book> bookByTitle(String title)throws NoSuchFieldException;
    
    List<Book> bookByAuthor(Integer author)throws NoSuchFieldException, UserPrincipalNotFoundException;
    
    
    

}
