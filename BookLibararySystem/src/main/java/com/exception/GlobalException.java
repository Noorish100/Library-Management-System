package com.exception;

import java.time.LocalDateTime;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice
public class GlobalException {
	
	
	    @ExceptionHandler(MethodArgumentNotValidException.class)
	    @ResponseStatus(HttpStatus.BAD_REQUEST)
	    public ResponseEntity<String> handleValidationExceptions(MethodArgumentNotValidException ex) {
	        return ResponseEntity.badRequest().body("Validation errors: " + ex.getBindingResult().getAllErrors());
	    }
	
	@ExceptionHandler(NoSuchFieldError.class)
	public ResponseEntity<MyError> notFound(NoSuchFieldError cf,WebRequest wr){
		
		MyError myError= new MyError();
		
		myError.setMsg("not found");
		myError.setTime(LocalDateTime.now());
		myError.setDes(wr.getDescription(false));
		
		return new ResponseEntity<MyError>(myError,HttpStatus.BAD_REQUEST);
		
	}
	
	@ExceptionHandler(Exception.class)
	public ResponseEntity<MyError> notFound(Exception cf,WebRequest wr){
		
		MyError myError= new MyError();
		
		myError.setMsg(cf.getMessage());
		myError.setTime(LocalDateTime.now());
		myError.setDes(wr.getDescription(false));
		
		return new ResponseEntity<MyError>(myError,HttpStatus.BAD_REQUEST);
		
	}
	
	
	
	
	 
	 

}
