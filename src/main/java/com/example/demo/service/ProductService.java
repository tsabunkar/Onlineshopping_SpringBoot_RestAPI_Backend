package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.Product;
import com.example.demo.repositry.ProductRepositry;

@Service
public class ProductService {

	@Autowired
	private ProductRepositry productRepositry;

	public List<Product> getAllProducts() {
		List<Product> listOfProdus = new ArrayList<Product>();
		productRepositry.findAll().forEach(listOfProdus::add);
		return listOfProdus;

	}

	public Product getParticularProd(int id) {
		return productRepositry.findOne(id);
	}

	public Product createProduct(Product product) {
		return productRepositry.save(product);
	}

	public void removeProduct(int id) {
		productRepositry.delete(id);
	}

	public String updateProduct(Product prod) {
		Product p = productRepositry.save(prod);
		return p != null ? "1 Record inserted.." : "No record inserted";
	}

}
