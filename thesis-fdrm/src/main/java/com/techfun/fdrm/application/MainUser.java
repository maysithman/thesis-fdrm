package com.techfun.fdrm.application;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.techfun.fdrm.model.User;
import com.techfun.fdrm.service.UserService;

public class MainUser {

	public static void main(String[] args) {
		ApplicationContext appContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		UserService userService = appContext.getBean("userService", UserService.class);
		
		testCreateUser(userService);
		//testUpdateUser(userService);
		//testSelectUser(userService);
		//testDeleteUser(userService);
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

	private static void testSelectUser(UserService userService) {
		
	}

	private static void testDeleteUser(UserService userService) {
		User user = new User();
		user.setId(1);
		
		userService.deleteUser(user);
		
		System.out.println("Deleted User Successfully.");
	}

}
