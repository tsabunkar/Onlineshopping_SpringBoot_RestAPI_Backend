package com.example.demo.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.dto.Product;
import com.example.demo.service.ProductService;

@RestController
public class OnlineShoppingController {

	@Autowired
	private ProductService productService;

	@RequestMapping(path = "/productslist", method = RequestMethod.GET)
	public List<Product> getAllProducts() {
		return productService.getAllProducts();
	}

	@RequestMapping(path = "/productslist/{productId}", method = RequestMethod.GET)
	public Product getProduct(@PathVariable int productId) {
		return productService.getParticularProd(productId);
	}

	@RequestMapping(path = "/productslist", method = RequestMethod.POST)
	public Product createProduct(@Valid @RequestBody Product product) {
		return productService.createProduct(product);
	}

	@RequestMapping(path = "/productslist/{productId}", method = RequestMethod.DELETE)
	public void deleteMyProduct(@PathVariable int productId) {
		productService.removeProduct(productId);
	}

	@RequestMapping(path = "/productslist/{productId}", method = RequestMethod.PUT)
	public String updateExistingProduct(@Valid @RequestBody Product prod) {
		return productService.updateProduct(prod);
	}
}
