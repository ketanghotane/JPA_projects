package com.lti.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import com.lti.model.Users;
import com.lti.utils.JpaUtils;

public class UserDao {
	
	private EntityManager entitymanager;

	public UserDao() {
		entitymanager=JpaUtils.geEntityManager();
		// TODO Auto-generated constructor stub
	}
	
	public int readLogin(String username, String password)
	{
		String query="Select u from Users u where u.username='"+username+"' and u.password='"+password+"'";
		TypedQuery<Users> tquery= entitymanager.createQuery(query,Users.class);
		List<Users> list= tquery.getResultList();
		if(list!=null && list.size()>0)
			return 1;
		else 
			return 0;
	}
	public int createUser(Users user ){
		entitymanager.persist(user);
		return 1;
	}
	
	public Users readUserByUsername(String username){
		Users user= entitymanager.find(Users.class, username);
		return user;
	}
	
	public List<Users> readAllUsers(){
		String query="Select u from Users u order by u.username";
		TypedQuery<Users> tquery=entitymanager.createQuery(query,Users.class);
		List<Users> list=tquery.getResultList();
		return list;
		
	}
	
	public Users updateUsers(Users user) {
		Users user2 = entitymanager.merge(user);
		return user2;
	}
	
	public int deleteUsers(String username) {
		Users user = readUserByUsername(username);
		if (user != null){
			entitymanager.remove(user);
			return 1;
			}
		return 0;
	}
	public void beginTransaction() {
		entitymanager.getTransaction().begin();
		
	}
	
	public void commitTransaction() {
		entitymanager.getTransaction().commit();
	}

	
	public void rollBackTransaction() {
	
	}

	public List<Users> readUserByname(String name) {
		String query="Select u from Users u where u.firstname='"+name+"'";
		TypedQuery<Users> tquery= entitymanager.createQuery(query,Users.class);
		List<Users> list=tquery.getResultList();
		return list;
	}
	
}
