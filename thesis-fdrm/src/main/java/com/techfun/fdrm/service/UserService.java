package com.techfun.fdrm.service;

import com.techfun.fdrm.model.User;

public interface UserService {

	void createUser (User user);
	void updateUser (User user);
	void selectUser (User user);
	void deleteUser (User user);
	
}
