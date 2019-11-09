package com.lti.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Transaction")
public class Transaction {
	@Id
	@Column(name="tran_id")
	private int transactionId;
	@Column(name="tran_amt")
	private int transactionAmt;
	
	
	
	
	

}
