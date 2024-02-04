package com.hexaware.rest.exceptionhandling.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {
	
	
	
	@ResponseStatus(value=HttpStatus.NOT_ACCEPTABLE , reason="Some Exception occur" )
	@ExceptionHandler({ArithmeticException.class})
     public ResponseEntity<String> handlerExp(ArithmeticException e) {
	
		
		return new ResponseEntity<String>(e.toString(),HttpStatus.NOT_FOUND);
	}
}
