package com.techfun.fdrm_web.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techfun.fdrm_web.model.Login;
import com.techfun.fdrm_web.model.User;
import com.techfun.fdrm_web.repository.UserRepository;

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
	public void deleteUser(User user) {
		userRepository.deleteUser(user);
	}

	@Override
	public List<User> selectAllUsers(User user) {
		return userRepository.selectAllUsers(user);
	}

	@Override
	public User selectExactUser(User user) {
		return userRepository.selectExactUser(user);
	}

	@Override
	public int numOfUser(User user) {
		return userRepository.numOfUser(user);
	}

	@Override
	public User validateUser(Login login) {
		return userRepository.validateUser(login);
	}

}
