package com.hexaware.rest.exceptionhandling.restcontroller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HelloRestController {
	
	@GetMapping("/div{namu1}/{num2}")
	public String divNumbers(@PathVariable int num1, @PathVariable int num2) {
		
		int result  =num1/num2;
		return "Div of num is: "+result;
	}
    
	//@ResponseStatus(value=HttpStatus.EXPECTATION_FAILED ,reason ="Sorry You can't div number by Zero")
	//@ExceptionHandler({ArithmeticException.class,NullPointerException.class})
	//public ResponseEntity<String> execptionHandler() {
		
		//System.out.println("Exception Handle");
	//	return new ResponseEntity<String>("Num can't be div by Zero" , HttpStatus.BAD_REQUEST);
	//}
	
	
	
	
	
}
