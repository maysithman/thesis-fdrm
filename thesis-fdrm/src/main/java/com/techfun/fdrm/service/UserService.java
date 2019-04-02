package com.techfun.fdrm.service;

import java.util.List;

import com.techfun.fdrm.model.User;

public interface UserService {

	void createUser (User user);
	
	void updateUser (User user);
	
	List<User> selectAllUsers (User user);
	
	void deleteUser (User user);
	
	User selectExactUser (User user);
	
	int numOfUser(User user);
	
}
