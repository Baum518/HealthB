package me.groupb.service;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import me.groupb.model.User;
import me.groupb.util.SpringTestBase;

public class UserServiceTest extends SpringTestBase{
	@Autowired 
	private UserService userService;
	
	@Test
	public void testConfig(){
		assertNotNull(userService);
		assertTrue(userService != null);
	}
	
	@Test
	public void testfindUser(){
		List<User> lUsers = userService.findUser();
		for(User user:lUsers){
			System.out.println("NikeName:" + user.getNickName());
		}
		assertTrue(userService.findUser().size()!=0);
	}
}
