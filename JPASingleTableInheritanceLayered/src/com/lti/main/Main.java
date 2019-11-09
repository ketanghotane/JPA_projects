package com.lti.main;


import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.lti.model.Current;
import com.lti.model.Savings;
import com.lti.services.AccountServices;
import com.lti.services.AccountServicesImpl;

public class Main {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		AccountServices service= new AccountServicesImpl();
		
		/*EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA_PU");
		EntityManager manager = factory.createEntityManager();
		
		Savings s = new Savings(1000001, "Prajwal", 5000, 4.0);
		Current c = new Current(1000010, "LTI LTD", 900000, 50000);
		
		manager.getTransaction().begin();
		manager.persist(s);
		manager.persist(c);
		manager.getTransaction().commit();*/

	System.out.println("Enter your account number:");
		long accno=sc.nextLong();
		boolean result=service.verifyAccount(accno);
		if(result)
		{
			System.out.println("Account Verified!");
			//System.out.println("Available balance");
			System.out.println("Choose a valid option: ");
			System.out.println("1. Withdraw");
			System.out.println("2. Deposit");
			System.out.println("3. Transfer");
			
			
			
			
			
			
		}
		else{
			System.out.println("Invalid account number");
		}
		
		
		

	}

}
