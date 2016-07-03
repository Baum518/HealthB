package me.groupb.test.sqlserver;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;

import me.groupb.model.User;

import org.springframework.test.context.junit4.*;

//import me.groupb.util.HibernateSessionFactory;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class TestUser extends AbstractTransactionalJUnit4SpringContextTests{
//	@Autowired
	private SessionFactory sessionFactory;
	
	@Test
	public void testA()
	{
		Session session = sessionFactory.getCurrentSession();
		session.beginTransaction();
//		List<User> uList = session.createQuery("select u from User u").list();
//		System.out.println(uList.isEmpty());
//		for(User u:uList){
//			System.out.println("NickName:"+u.getNickName());
//		}
		session.getTransaction().commit();
		session.close();
	}
//	public static void main(String args[])throws Exception{
//		Session session = HibernateSessionFactory.getSession();
//		session.beginTransaction();
//		User user = new User();
//		user.setUserId(102);
//		user.setNickName("中文");
//		user.setRegisterName("Baum");
//		user.setShenFenZhengID("500235201606306666");
//		user.setPasswordMD5("123");
//		user.setCreateTime(new Date());
//		user.setState(1);
//		
//		session.persist(user);
//		session.getTransaction().commit();
		
		/*
		List<User> uList = session.createQuery("select u from User u").list();
		System.out.println(uList.isEmpty());
		for(User u:uList){
			System.out.println("NickName:"+u.getNickName());
		}
		session.getTransaction().commit();
		session.close();
		*/
//	}
}

 