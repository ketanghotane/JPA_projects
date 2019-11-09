package com.lti.main;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.lti.model.Current;
import com.lti.model.Savings;

public class Main {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA_PU");
		EntityManager manager = factory.createEntityManager();
		
		Savings s = new Savings(1000001, "Prajwal", 5000, 4.0);
		Current c = new Current(1000010, "LTI LTD", 900000, 50000);
		
		manager.getTransaction().begin();
		manager.persist(s);
		manager.persist(c);
		manager.getTransaction().commit();

	}

}
