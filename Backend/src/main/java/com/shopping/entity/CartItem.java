package com.shopping.entity;

import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class CartItem {

	
	private int userId;
	
	private List<CartProducts> cartProducts;

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public List<CartProducts> getCartProducts() {
		return cartProducts;
	}

	public void setCartProducts(List<CartProducts> cartProducts) {
		this.cartProducts = cartProducts;
	}
	
	
}
