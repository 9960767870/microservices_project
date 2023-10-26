package com.microservices.hotelservice.Exceptions;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;


@RestControllerAdvice
public class GlobalException {

	@ExceptionHandler(ResourceNotFoundException.class)
	public ResponseEntity<Map<String, Object>> handlerResourceNotFoundException(ResourceNotFoundException resourceNotFoundException){
		
		Map<String, Object> response = new HashMap<>();
		
		response.put("Message", resourceNotFoundException.getMessage());
		response.put("Success", false);
		response.put("Status", HttpStatus.NOT_FOUND);
		 
		 return new ResponseEntity<>(response,HttpStatus.NOT_FOUND);
		 
		 
	}
}
