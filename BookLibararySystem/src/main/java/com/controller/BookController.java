package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Entity.Author;
import com.Entity.Book;
import com.Entity.DTO;
import com.services.BookImpl;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api")
public class BookController {
	
	@Autowired
	private BookImpl bookImpl;
	
	    @GetMapping("/books")
	    public ResponseEntity<List<DTO>> getAllBook() {
	        List<DTO> ans=bookImpl.retriveAllBook();
	        return ResponseEntity.ok(ans);
	    }
	  
	    @PostMapping("/books")
	    public ResponseEntity<String> addBook(@RequestBody @Valid Book b,BindingResult result) throws NoSuchFieldException {
	    	
	    	if (result.hasErrors()) {
	            // Handle validation errors
	            return ResponseEntity.badRequest().body("Validation errors: " + result.getAllErrors());
	        }
	        String ans=bookImpl.addBook(b);
	        return ResponseEntity.ok(ans);
	    }
	    
	    @DeleteMapping("/books/{id}")
	    public ResponseEntity<String> delBookById(@PathVariable("id") Integer id) throws NoSuchFieldException {
	        String ans=bookImpl.delBookById(id);
	        return ResponseEntity.ok(ans);
	    }
	    
	    @GetMapping("/books/{id}")
	    public ResponseEntity<DTO> getBookById(@PathVariable("id") Integer id) throws NoSuchFieldException {
	        DTO ans=bookImpl.getBookById(id);
	        return ResponseEntity.ok(ans);
	    }
	    
	    @PutMapping("/books/{id}")
	    public ResponseEntity<Book> updateBookById(@PathVariable("id") Integer id) throws NoSuchFieldException {
	        Book ans=bookImpl.updateBookById(id);
	        return ResponseEntity.ok(ans);
	    }
	    
	      @GetMapping("/books/title/{t}")
		  public ResponseEntity<List<Book>> getBookBytitle(@PathVariable String t) throws NoSuchFieldException {
		        List<Book> ans=bookImpl.bookByTitle(t);
		        return ResponseEntity.ok(ans);
		    }
	      
	      @GetMapping("/books/author")
		  public ResponseEntity<List<Book>> getBookBytitle(@RequestBody Author t) throws NoSuchFieldException {
		        List<Book> ans=bookImpl.bookByAuthor(t);
		        return ResponseEntity.ok(ans);
		    }
	    
	  

}
