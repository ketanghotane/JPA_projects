package com.lti.main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.lti.model.Address;
import com.lti.model.Student;

public class Main {

	public static void main(String[] args){
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA_PU");
		EntityManager manager = factory.createEntityManager();
		Student student = new Student( 10, "Prajwal", 70.50);
		Address address = new Address("Pune", "MH", "411044");
		student.setAddress(address);
		manager.getTransaction().begin();
		manager.persist(student);
		manager.persist(address);
		manager.getTransaction().commit();
	}
}
