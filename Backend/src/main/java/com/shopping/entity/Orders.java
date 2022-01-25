package com.shopping.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="orders")
public class Orders {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int orderId;
	
	@Column
	private int orderedQuantity;
	
	@Column
	private int orderPrice;
	
	@OneToOne
	@JoinColumn(name="fk_produt_id")
	private Products product;
	
	@OneToOne
	@JoinColumn(name="fk_customer_id")
	private Customer customer;
	
	
	public Orders() {
		
	}

	public Orders(int orderId, int orderedQuantity, int orderPrice, Products product) {
		super();
		this.orderId = orderId;
		this.orderedQuantity = orderedQuantity;
		this.orderPrice = orderPrice;
		this.product = product;
	}
	
	

	public Orders(int orderId, int orderedQuantity, int orderPrice, Products product, Customer customer) {
		super();
		this.orderId = orderId;
		this.orderedQuantity = orderedQuantity;
		this.orderPrice = orderPrice;
		this.product = product;
		this.customer = customer;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public int getOrderedQuantity() {
		return orderedQuantity;
	}

	public void setOrderedQuantity(int orderedQuantity) {
		this.orderedQuantity = orderedQuantity;
	}

	public int getOrderPrice() {
		return orderPrice;
	}

	public void setOrderPrice(int orderPrice) {
		this.orderPrice = orderPrice;
	}

	public Products getProduct() {
		return product;
	}

	public void setProduct(Products product) {
		this.product = product;
	}

	
	
	
}
