package com.techfun.fdrm.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.techfun.fdrm.model.User;
import com.techfun.fdrm.repository.util.UserRowMapper;

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
	public void deleteUser(User user) {
		String deleteUser = "DELETE FROM Users WHERE id = ?";
		jdbcTemplate.update(deleteUser, user.getId());
	}

	@Override
	public List<User> selectAllUsers(User user) {
		String allUsersSQL = "SELECT * FROM Users";
		return jdbcTemplate.query(allUsersSQL, new UserRowMapper());
	}

	@Override
	public User selectExactUser(User user) {
		String selectUserSQL = "SELECT * FROM Users WHERE id=?";
		return jdbcTemplate.queryForObject(selectUserSQL, new UserRowMapper(), user.getId());
	}

	@Override
	public int numOfUser(User user) {
		String countUserSQL = "SELECT COUNT(*) FROM Users";
		return jdbcTemplate.queryForObject(countUserSQL, Integer.class);
	}

}
