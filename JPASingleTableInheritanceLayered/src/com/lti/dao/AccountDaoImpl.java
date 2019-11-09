package com.lti.dao;

import javax.persistence.EntityManager;

import com.lti.model.Account;
import com.lti.utils.JpaUtils;

public class AccountDaoImpl implements AccountDao{

	EntityManager manager;
	
	public AccountDaoImpl() {
		manager= JpaUtils.geEntityManager();
		// TODO Auto-generated constructor stub
	}

	
		
	@Override
	public int removeAmount() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int addamount() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int sendAmount() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void beginTransaction() {
		manager.getTransaction().begin();
		
	}

	@Override
	public void commitTransaction() {
		manager.getTransaction().commit();
		
	}

	@Override
	public void rollbackTransaction() {
		manager.getTransaction().rollback();
		
	}

	@Override
	public int checkAccount(long accno) {
		Account account=manager.find(Account.class,accno);
		System.out.println(account);
		if(account!=null)
		return 1;
		else
			return 0;
	}

	
		
}
