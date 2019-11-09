package com.lti.services;

import com.lti.dao.AccountDao;
import com.lti.dao.AccountDaoImpl;

public class AccountServicesImpl implements AccountServices{
	
	AccountDao dao=null;
	@Override
	public int withdrawAmount() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int depositAmount() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int transferAmount() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean verifyAccount(long accno) {
		int result= dao.checkAccount(accno);
		if(result==1)
		return true;
		else
			return false;
	}

	public AccountServicesImpl() {
		dao= new AccountDaoImpl();
		// TODO Auto-generated constructor stub
	}
	

	
}
