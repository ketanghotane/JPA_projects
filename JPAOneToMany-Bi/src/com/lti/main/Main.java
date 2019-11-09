package com.lti.main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.lti.model.Department;
import com.lti.model.Employee;

public class Main {

	public static void main(String[] args){
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA_PU");
		EntityManager manager = factory.createEntityManager();
		
		Department dept = new Department(10, "Development");		
		Employee e1 = new Employee(101, "Prajwal", 7000);
		e1.setDepartment(dept);
		Employee e2 = new Employee(102, "Omkar", 5000);
		e2.setDepartment(dept);
		Employee e3 = new Employee(103, "Moh", 6000);
		e3.setDepartment(dept);
		Employee e4 = new Employee(104, "Gayatri", 8000);
		e4.setDepartment(dept);
		dept.addEmployee(e1);
		dept.addEmployee(e2);
		dept.addEmployee(e3);
		dept.addEmployee(e4);
		
		manager.getTransaction().begin();
		manager.persist(dept);
		manager.getTransaction().commit();
		
	}
}
// TIGGER 