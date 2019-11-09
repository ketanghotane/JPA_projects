package com.lti.model;


import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value="saving")
public class Savings extends Account {
	private double roi;

	public double getRoi() {
		return roi;
	}

	public void setRoi(double roi) {
		this.roi = roi;
	}

	public Savings() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Savings(long accountNumber, String accountHolderName, double accountBalance, double roi) {
		super(accountNumber, accountHolderName, accountBalance);
		this.roi = roi;
	}

	@Override
	public String toString() {
		return "Savings [roi=" + roi + ", toString()=" + super.toString() + "]";
	}
}
	
	
	