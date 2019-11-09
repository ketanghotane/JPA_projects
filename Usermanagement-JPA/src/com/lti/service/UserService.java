package com.lti.service;

import java.security.Provider.Service;
import java.util.List;

import com.lti.dao.UserDao;
import com.lti.model.Users;



public class UserService {

	
	
	private UserDao userdao;
	
	public UserService() {
		userdao= new UserDao();
		
	}
	
	public boolean checkLogin(String username, String password){
		
	int result=	userdao.readLogin(username, password);
		if(result==1)
		return true;
		else
			return false;
		
	}
	
	public boolean addUser(Users user){
		userdao.beginTransaction();
		int result= userdao.createUser(user);
		if (result == 1){
			userdao.commitTransaction();
			return true;
		}else{
			userdao.rollBackTransaction();
			return false;
		}
		
	}
	public List<Users> findAllUsers(){
		
		return userdao.readAllUsers();
	}
	public Users findUserByUsername (String username){
		Users user= userdao.readUserByUsername(username);
		return user;
	}
	public Users modifyUser(Users username){
		Users user= userdao.updateUsers(username);
		userdao.commitTransaction();
		return user;
		
	}
	public boolean removeUser (String username){
		userdao.beginTransaction();
		int result= userdao.deleteUsers(username);
		if (result == 1){
			userdao.commitTransaction();
			return true;
		}else{
			userdao.rollBackTransaction();
			return false;
		}
		
	}
	
	public List<Users> findUserByName(String name){
		List<Users> list= userdao.readUserByname(name);
		return list;
	}
	
}
