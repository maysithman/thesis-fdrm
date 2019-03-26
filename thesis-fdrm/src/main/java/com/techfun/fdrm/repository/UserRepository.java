package com.techfun.fdrm.repository;

import com.techfun.fdrm.model.User;

public interface UserRepository {

	void createUser(User user);
	void updateUser(User user);
	void selectUser(User user);
	void deleteUser(User user);
	
}
