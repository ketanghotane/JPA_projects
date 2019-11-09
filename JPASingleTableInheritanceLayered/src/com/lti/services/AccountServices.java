package com.lti.services;

public interface AccountServices {
	public boolean verifyAccount(long accno);
	public int withdrawAmount();
	public int depositAmount();
	public int transferAmount();

}
