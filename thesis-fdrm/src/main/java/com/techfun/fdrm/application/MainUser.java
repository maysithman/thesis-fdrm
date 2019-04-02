package com.techfun.fdrm.application;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.techfun.fdrm.model.User;
import com.techfun.fdrm.service.UserService;

public class MainUser {

	public static void main(String[] args) {
		ApplicationContext appContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		UserService userService = appContext.getBean("userService", UserService.class);
		
		//testCreateUser(userService);
		//testUpdateUser(userService);
		//testSelectAllUsers(userService);
		//testDeleteUser(userService);
		//testSelectExactUser(userService);
		testNumOfUser(userService);
	}

	private static void testNumOfUser(UserService userService) {
		User user = new User();
		System.out.println("The total number of users : " + userService.numOfUser(user));
	}

	private static void testSelectExactUser(UserService userService) {
		User user = new User();
		user.setId(3);
		
		User u = userService.selectExactUser(user);
		
		System.out.println(
				"Id : " + u.getId() + "\t" + 
				"Name : " + u.getName() + "\t" +
				"Password : " + u.getPassword() + "\t" +
				"Site id : " + u.getSiteId()
				);
	}

	private static void testSelectAllUsers(UserService userService) {
		User user = new User();
		
		List<User> users = userService.selectAllUsers(user);
		
		for(User u : users) {
			System.out.println(
					"Id : " + u.getId() + "\t" +
					"Name : " + u.getName() + "\t" +
					"Passowrd : " + u.getPassword() + "\t" +
					"Site Id : " + u.getSiteId()
					);
		}
	}

	private static void testCreateUser(UserService userService) {
		User user = new User();
		user.setName("Jin Jin");
		user.setPassword("12345");
		user.setSiteId(3);
		
		userService.createUser(user);
		
		System.out.println("Inserted User Successfully.");
	}

	private static void testUpdateUser(UserService userService) {
		User user = new User();
		user.setName("Zin Phyu");
		user.setId(1);
		
		userService.updateUser(user);
		
		System.out.println("Updated User Successfully.");
	}

	private static void testDeleteUser(UserService userService) {
		User user = new User();
		user.setId(1);
		
		userService.deleteUser(user);
		
		System.out.println("Deleted User Successfully.");
	}

}
