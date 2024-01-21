package com.services;


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Entity.Author;
import com.Entity.Book;
import com.Entity.DTO;
import com.repository.BookRepo;

@Service
public class BookImpl implements BookService {

	@Autowired
	private BookRepo bookRepo;
	
	
	@Override
	public List<DTO> retriveAllBook() {
		List<DTO> ans=new ArrayList<>();
		
		
		
		List<Book> l=bookRepo.findAll();
		
		for(Book b:l) {
			DTO d=new DTO();
			
			d.setBookId(b.getBookId());
			d.setIsbn(b.getIsbn());
			d.setQuantity(b.getQuantity());
			
			d.setBirthDate(b.getAuthor().getBirthDate());
			d.setName(b.getAuthor().getName());
			d.setTitle(b.getTitle());
			ans.add(d);
		}
	return ans;
	}

	@Override
	public Book addBook(Book b) throws NoSuchFieldException {
		return bookRepo.save(b);
		 
	}

	@Override
	public DTO getBookById(int id) throws NoSuchFieldException {
		DTO d=new DTO();
		Optional<Book> b= bookRepo.findById(id);
		if(b.isPresent()) {
			Book ba=b.get();
			
			d.setBookId(ba.getBookId());
			d.setIsbn(ba.getIsbn());
			d.setQuantity(ba.getQuantity());
		
			d.setBirthDate(ba.getAuthor().getBirthDate());
			d.setName(ba.getAuthor().getName());
			d.setTitle(ba.getTitle());
			return d;
		}
		
		throw new NoSuchFieldException("not found");
	}

	@Override
	public String delBookById(int id) throws NoSuchFieldException {
		
		Optional<Book> b= bookRepo.findById(id);
		if(b.isPresent()) {
		bookRepo.deleteById(id);
		
		return "deleted";
		}
		throw new NoSuchFieldException("not found");
	}

	@Override
	public Book updateBookById(int id) throws NoSuchFieldException {
		Optional<Book> b= bookRepo.findById(id);
		if(b.isPresent()) {
		  
			Book ba=b.get();
			ba.setQuantity(ba.getQuantity()+1);
			bookRepo.save(ba);
		
		return ba;
		}
		throw new NoSuchFieldException("not found");
	}

	@Override
	public List<Book> bookByTitle(String title) throws NoSuchFieldException {
		// TODO Auto-generated method stub
		
		return bookRepo.findByTitle(title);
	}

	@Override
	public List<Book> bookByAuthor(Author author) throws NoSuchFieldException {
		// TODO Auto-generated method stub
		return bookRepo.findByAuthor(author);
	}

}
