package me.groupb.dao;

import java.io.Serializable;
import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;


@Repository
public class BaseDao<T> extends HibernateDaoSupport{
	public Session getSession()
	{
		return this.currentSession();
	}
	public void update(T obj){
		Session session = getSession();
		session.update(obj);
	}
	
	public void create(T obj){
		Session session = getSession();
		session.persist(obj);
	}
	
	public void createOrUpdate(T obj){
		Session session = getSession();
		session.saveOrUpdate(obj);
	}
	
	public void delete(T obj){
		Session session = getSession();
		session.delete(obj);
	}
	
	@SuppressWarnings("unchecked")
	public T find(Class< ? extends T> clazz,Serializable id){
		Session session = getSession();
		return (T) session.get(clazz, id);
	}
	
	@SuppressWarnings("unchecked")
	public List<T> listSql(Class<? extends T> clazz,String sql){
		Session session = getSession();
		return session.createSQLQuery(sql).addEntity(clazz).list();
	}
	
	@SuppressWarnings("unchecked")
	public List<T> listSql(Class<? extends T> clazz,String sql,int start,int pagelistnum){
		Session session = getSession();
		return session.createSQLQuery(sql).addEntity(clazz).setFirstResult(start).setMaxResults(pagelistnum).list();
	}
	
	@SuppressWarnings("unchecked")
	public List<T> listHql(String hql){
		Session session = getSession();
		return session.createQuery(hql).list();
	} 	
	
	@SuppressWarnings("unchecked")
	public List<T> listHql(String hql,int start,int pagelistnum){
		Session session = getSession();
		return session.createQuery(hql).setFirstResult(start).setMaxResults(pagelistnum).list();
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public List<T> listHql(Class <? extends T> clazz){
		Session session = getSession();
		return session.createQuery(" from " + clazz.getName() ).list();
	}
	
	@SuppressWarnings({ "unchecked" , "rawtypes"})
	public List<T> listHql(Class< ? extends T> clazz,int start,int pagelistnum){
		Session session = getSession();
		return session.createQuery(" from "+clazz.getName()+" ").setFirstResult(start).setMaxResults(pagelistnum).list();
	}
	
	
	
	
	@Resource
	public void setFactory(SessionFactory factory)
	{
		super.setSessionFactory(factory);
	}
}



/*
import java.io.Serializable;
import java.util.List;

import org.hibernate.Session;

import me.groupb.util.HibernateSessionFactory;

public class BaseDAO<T> {
	public void create(T object){
		Session session = HibernateSessionFactory.getSession();
		
		try{
			session.beginTransaction();
			session.persist(object);
			session.getTransaction().commit();
		}catch(Exception e){
			session.getTransaction().rollback();
		}finally{
			session.close();
		}
	}
	
	public void update(T object){
		Session session = HibernateSessionFactory.getSession();
		
		try{
			session.beginTransaction();
			session.update(object);
			session.getTransaction().commit();
		}catch(Exception e){
			session.getTransaction().rollback();
		}finally{
			session.close();
		}
	}
	
	public void delete(T object){
		Session session = HibernateSessionFactory.getSession();
		
		try{
			session.beginTransaction();
			session.delete(object);
			session.getTransaction().commit();
		}catch(Exception e){
			session.getTransaction().rollback();
		}finally{
			session.close();
		}
	}
	
	@SuppressWarnings("unchecked")
	public T find(Class <?extends T>clazz,Serializable id){
		Session session = HibernateSessionFactory.getSession();
		try{
			session.beginTransaction();
			return  (T)session.get(clazz, id);
		}finally{
			session.getTransaction().commit();
			session.close();
		}
	}
	
	@SuppressWarnings("unchecked")
	public List<T> list(String hql){
		Session session = HibernateSessionFactory.getSession();
		try{
			session.beginTransaction();
			return session.createQuery(hql).list();
		}finally{
			session.getTransaction().commit();
			session.close();
		}
	}
}*/
