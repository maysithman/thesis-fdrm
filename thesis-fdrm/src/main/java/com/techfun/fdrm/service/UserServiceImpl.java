package com.techfun.fdrm.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techfun.fdrm.model.User;
import com.techfun.fdrm.repository.UserRepository;

@Service("userService")
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public void createUser(User user) {
		userRepository.createUser(user);
	}

	@Override
	public void updateUser(User user) {
		userRepository.updateUser(user);
	}

	@Override
	public void selectUser(User user) {
		userRepository.selectUser(user);
	}

	@Override
	public void deleteUser(User user) {
		userRepository.deleteUser(user);
	}

}
