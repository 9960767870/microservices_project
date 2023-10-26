package com.microservices.userservice.services;

import java.util.List;

import com.microservices.userservice.beans.User;

public interface UserService {

	
	public abstract User createUser(User user);
	
	public abstract List<User> getAllUser();
	
	public abstract User getUserById(int userId);
	
	public abstract User updateUser(User user);
	
	public abstract String deleteUser(int userId);
}
