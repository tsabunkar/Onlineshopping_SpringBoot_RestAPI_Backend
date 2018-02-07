package com.example.demo.repositry;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.dto.Product;

public interface ProductRepositry extends CrudRepository<Product, Integer> {

}
