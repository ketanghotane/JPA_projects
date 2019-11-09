package com.lti.model;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="Products")
public class Product implements Serializable{
	@Id
	private int productId;
	private String productName;
	private double productPrices;
	@ManyToMany(mappedBy="products")
	
	private Set<Order> orders= new HashSet<>();
	
	
	
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Product(int productId, String productName, double productPrices) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productPrices = productPrices;
		
		
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public double getProductPrices() {
		return productPrices;
	}
	public void setProductPrices(double productPrices) {
		this.productPrices = productPrices;
	}
	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", productPrices=" + productPrices
				+ "]";
	}
	
	

}
