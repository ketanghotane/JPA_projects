package com.lti.dao;

public interface AccountDao {
	public int checkAccount(long accno);
	public int removeAmount();
	public int addamount();
	public int sendAmount();
	public void beginTransaction();
	public void commitTransaction();
	public void rollbackTransaction();

}
