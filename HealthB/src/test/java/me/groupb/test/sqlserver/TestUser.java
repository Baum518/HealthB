package me.groupb.test.sqlserver;

import org.hibernate.Session;

import java.util.Date;
import java.util.List;
import me.groupb.model.User;
import me.groupb.util.HibernateSessionFactory;

public class TestUser {
	public static void main(String args[])throws Exception{
		Session session = HibernateSessionFactory.getSession();
		session.beginTransaction();
		@SuppressWarnings("unchecked")
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
		
		
		List<User> uList = session.createQuery("select u from User u").list();
		System.out.println(uList.isEmpty());
		for(User u:uList){
			System.out.println("NickName:"+u.getNickName());
		}
		session.getTransaction().commit();
		session.close();
	}
}
