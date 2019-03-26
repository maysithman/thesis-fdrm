package com.techfun.fdrm.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.techfun.fdrm.model.User;

@Repository("userRepository")
public class UserRepositoryImpl implements UserRepository {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public void createUser(User user) {
		String insertUser = "INSERT INTO Users(Name, Password, SiteId) VALUES(?, ?, ?)";
		jdbcTemplate.update(insertUser, user.getName(), user.getPassword(), user.getSiteId());
	}

	@Override
	public void updateUser(User user) {
		String updateUser = "UPDATE Users SET Name = ? WHERE Id = ?";
		jdbcTemplate.update(updateUser, user.getName(), user.getId());
	}

	@Override
	public void selectUser(User user) {
		
	}

	@Override
	public void deleteUser(User user) {
		String deleteUser = "DELETE FROM Users WHERE id = ?";
		jdbcTemplate.update(deleteUser, user.getId());
	}

}
