package com.techfun.fdrm.repository;

import java.util.List;

import com.techfun.fdrm.model.User;

public interface UserRepository {

	void createUser(User user);
	
	void updateUser(User user);
	
	List<User> selectAllUsers(User user);
	
	void deleteUser(User user);
	
	User selectExactUser(User user);
	
	int numOfUser(User user);
	
}
