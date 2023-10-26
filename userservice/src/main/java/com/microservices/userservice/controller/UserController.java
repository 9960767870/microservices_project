package com.microservices.userservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.microservices.userservice.beans.User;
import com.microservices.userservice.services.UserService;

@RestController
@RequestMapping("/v1/micro")
public class UserController {

	@Autowired
	UserService userService;
	
	@PostMapping("/createuser")
	public ResponseEntity<User> createUser(@RequestBody User user){
		
		User createUser = userService.createUser(user);
		
		return ResponseEntity.status(HttpStatus.CREATED).body(createUser);
		
	}
	
	@GetMapping("/getalluser")
	public ResponseEntity<List<User>> getAllUser(){
		
		List<User> allUser = userService.getAllUser();
		
		return ResponseEntity.status(HttpStatus.OK).body(allUser);
		
	}
	
	@GetMapping("/getuserbyid")
	public ResponseEntity<User> getUserById(@RequestParam int userId){
		
		 User userById = userService.getUserById(userId);
		
		return ResponseEntity.status(HttpStatus.OK).body(userById);
		
	}
	
	@PutMapping("/updateuser")
	public ResponseEntity<User> updateUser(@RequestBody User user){
		
		 User updatedUser = userService.updateUser(user);
		
		return ResponseEntity.status(HttpStatus.OK).body(updatedUser);
		
	}
	
	
	@DeleteMapping("/deleteuser")
	public ResponseEntity<String> deleteUser(@RequestParam int userId){
		
		 String deleteUser = userService.deleteUser(userId);
		
		return ResponseEntity.status(HttpStatus.OK).body(deleteUser);
		
	}
	
	
}
