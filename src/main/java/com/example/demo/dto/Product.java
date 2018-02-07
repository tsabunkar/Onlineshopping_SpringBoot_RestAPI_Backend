package com.example.demo.dto;

import static org.mockito.Matchers.anyInt;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.validator.constraints.Length;

@Entity
@Table(name = "onlineshopping_table")
public class Product {
	@Id
	@Column(name = "productId", columnDefinition = "INT(100)")
	private int productId;

	@Column(name = "productName")
	private String productName;

	@Column(name = "productCode")
	private String productCode;

	@Column(name = "productAvaliableDate")
	private String productAvaliableDate;

	@Column(name = "price", columnDefinition = "INT(100)")
	private int price;

	@Column(name = "productRating", columnDefinition = "INT(50)")
	private int productRating;

	@Column(name = "productImage")
	private String productImage;

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

	public String getProductCode() {
		return productCode;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getProductAvaliableDate() {
		return productAvaliableDate;
	}

	public void setProductAvaliableDate(String productAvaliableDate) {
		this.productAvaliableDate = productAvaliableDate;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getProductRating() {
		return productRating;
	}

	public void setProductRating(int productRating) {
		this.productRating = productRating;
	}

	public String getProductImage() {
		return productImage;
	}

	public void setProductImage(String productImage) {
		this.productImage = productImage;
	}

	public Product(int productId, String productName, String productCode, String productAvaliableDate, int price,
			int productRating, String productImage) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productCode = productCode;
		this.productAvaliableDate = productAvaliableDate;
		this.price = price;
		this.productRating = productRating;
		this.productImage = productImage;
	}

	public Product() {
		// TODO Auto-generated constructor stub
	}

}
