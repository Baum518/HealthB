package me.groupb.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;

import me.groupb.dao.UserDao;
import me.groupb.model.User;


@Service
@Transactional
public class UserService {
	private static final String User = null;
	@Autowired
	private UserDao userDao;
	
	
	@RequestMapping("findUser")
	public List<User> findUser(){
		List<User> lUsers = userDao.listHql(User);
		return lUsers;
	}
}
