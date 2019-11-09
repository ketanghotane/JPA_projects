package com.lti.model;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="Orders")
public class Order implements Serializable {

	@Id
	private int orderId;
	@Temporal(TemporalType.DATE)
	private Date purchaseDate;
	@ManyToMany(cascade=CascadeType.ALL)
	@JoinTable(name="OrderProduct",
			joinColumns={@JoinColumn(name="OrderId")},
			inverseJoinColumns={@JoinColumn(name="ProductId")}
			)
	private Set<Product> products= new HashSet<>();
	
	
	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", purchaseId=" + purchaseDate + "]";
	}
	
	public void addProduct(Product product){
		products.add(product);
	}
	
	
	
	
	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Order(int orderId, Date purchaseId) {
		super();
		this.orderId = orderId;
		this.purchaseDate = purchaseId;
	}
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public Date getPurchaseDate() {
		return purchaseDate;
	}
	public void setPurchaseDate(Date purchaseId) {
		this.purchaseDate = purchaseId;
	}
	
	
	
}
