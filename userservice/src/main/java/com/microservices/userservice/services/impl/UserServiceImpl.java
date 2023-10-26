package com.microservices.userservice.services.impl;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.microservices.userservice.Exceptions.ResourceNotFoundException;
import com.microservices.userservice.beans.User;
import com.microservices.userservice.repository.UserRepository;
import com.microservices.userservice.services.UserService;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	UserRepository userRepository;
	
	
	
	@Override
	public User createUser(User user) {
		
		String string = UUID.randomUUID().toString();
		int id =(int) Thread.currentThread().getId();
		user.setUserID(id);
		return userRepository.save(user);
	}

	@Override
	public List<User> getAllUser() {
		return userRepository.findAll();
	}

	@Override
	public User getUserById(int userId) {
		return userRepository.findById(userId).orElseThrow(()->new ResourceNotFoundException("User With Given Id is Not Found "+userId));
	}

	@Override
	public User updateUser(User user) {
		User user2 = userRepository.findById(user.getUserID()).get();
		user2.setUserID(user.getUserID());
		user2.setUserName(user.getUserName());
		user2.setEmail(user.getEmail());
		user2.setPhoneNo(user.getPhoneNo());
		
		return userRepository.save(user2);
	}

	@Override
	public String deleteUser(int userId) {
		 userRepository.deleteById(userId);
		 return "SuccessFully Deleted User";
	}

	
	
	
}
