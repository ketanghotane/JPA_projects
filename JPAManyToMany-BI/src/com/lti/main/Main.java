package com.lti.main;

import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.lti.model.Order;
import com.lti.model.Product;

public class Main {

	public static void main(String[] args) {
		
		
		EntityManagerFactory factory= Persistence.createEntityManagerFactory("JPA_PU");
		EntityManager manager = factory.createEntityManager();
		
		Product elecProduct= new Product();
		elecProduct.setProductId(1);
		elecProduct.setProductName("LED TV");
		elecProduct.setProductPrices(50000);
		
		
		Product babyProduct= new Product();
		babyProduct.setProductId(2);
		babyProduct.setProductName("Shampoo");
		babyProduct.setProductPrices(250);
		
		Product beautyProduct= new Product();
		beautyProduct.setProductId(4);
		beautyProduct.setProductName("Bulb");
		beautyProduct.setProductPrices(500);
	
		Product eleProduct= new Product();
		eleProduct.setProductId(3);
		eleProduct.setProductName("Bulb");
		eleProduct.setProductPrices(500);
		
		Order firstOrder=new Order();
		firstOrder.setOrderId(1001);
		firstOrder.setPurchaseDate(new Date());

		firstOrder.addProduct(babyProduct);
		firstOrder.addProduct(elecProduct);
		firstOrder.addProduct(eleProduct);
		
		Order secondOrder=new Order();
		secondOrder.setOrderId(1002);
		secondOrder.setPurchaseDate(new Date());
		
		secondOrder.addProduct(babyProduct);
		secondOrder.addProduct(beautyProduct);
		secondOrder.addProduct(eleProduct);

		manager.getTransaction().begin();
		manager.persist(firstOrder);
		manager.persist(secondOrder);
		manager.getTransaction().commit();
	}

}
