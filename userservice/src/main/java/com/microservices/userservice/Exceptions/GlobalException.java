package com.microservices.userservice.Exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.microservices.userservice.utility.ApiResponse;
import com.microservices.userservice.utility.ApiResponse.ApiResponseBuilder;

@RestControllerAdvice
public class GlobalException {

	@ExceptionHandler(ResourceNotFoundException.class)
	public ResponseEntity<ApiResponseBuilder> handlerResourceNotFoundException(ResourceNotFoundException resourceNotFoundException){
		
		
		
		ApiResponseBuilder response = ApiResponse.builder().message(resourceNotFoundException.getMessage()).success(true).status(HttpStatus.NOT_FOUND);
		 
		 return new ResponseEntity<>(response,HttpStatus.NOT_FOUND);
		 
		 
	}
}
