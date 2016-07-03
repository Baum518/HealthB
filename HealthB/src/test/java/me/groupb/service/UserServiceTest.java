package me.groupb.service;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

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
		assertTrue(userService.findUser().size()!=0);
	}
}
