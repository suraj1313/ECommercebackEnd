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
@Table(name="products")
public class Products {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int productId;
	
	@Column(length = 75, nullable = false, unique = true)
	private String productName;
	
	@Column
	private int productPrice;
	
	@Column
	private String productColour;
	
	@Column
	private String productSize;
	
	@Column
	private String productImag;
	
	@OneToOne
	@JoinColumn(name="fk_category")
	private Category category;

	
	public Products() {
		
	}


	public Products(int productId, String productName, int productPrice, String productColour, String productSize,
			Category category) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productPrice = productPrice;
		this.productColour = productColour;
		this.productSize = productSize;
		this.category = category;
	}


	
	
	public String getProductImag() {
		return productImag;
	}


	public void setProductImag(String productImag) {
		this.productImag = productImag;
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


	public int getProductPrice() {
		return productPrice;
	}


	public void setProductPrice(int productPrice) {
		this.productPrice = productPrice;
	}


	public String getProductColour() {
		return productColour;
	}


	public void setProductColour(String productColour) {
		this.productColour = productColour;
	}


	public String getProductSize() {
		return productSize;
	}


	public void setProductSize(String productSize) {
		this.productSize = productSize;
	}


	public Category getCategory() {
		return category;
	}


	public void setCategory(Category category) {
		this.category = category;
	}
	
}
