package com.revature.chatroomServer;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.revature.chatroomServer.controller.UserController;
import com.revature.chatroomServer.models.User;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ChatroomServerApplicationTests {

	@Autowired
	private User user;
	
	@Autowired
	UserController control;
	
	@Test
	public void addUser() {
		user.setAdminLvl(1);
		user.setEmail("evan.bradford1@gmail.com");
		user.setPassword("12345");
		user.setStatus(1);
		
		control.register(user);
	}

}
