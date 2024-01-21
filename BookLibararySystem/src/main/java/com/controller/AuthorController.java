package com.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Entity.Author;
import com.Entity.DTO;
import com.services.AuthorImpl;

@RestController
@RequestMapping("/api")
public class AuthorController {

	
	@Autowired
	private AuthorImpl authorImpl;
	
	@GetMapping("/authors")
    public ResponseEntity<List<Author>> getAllAuthor() {
        List<Author> ans=authorImpl.retriveAllAuthor();
        return ResponseEntity.ok(ans);
    }
	
	@GetMapping("/authors/{date}")
    public ResponseEntity<List<Author>> getAllAuthor(@PathVariable("date") String date) throws ParseException {
		
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		
		Date d=dateFormat.parse(date);
		
		
		
        List<Author> ans=authorImpl.AllbornAfter(d);
        return ResponseEntity.ok(ans);
    }
}
