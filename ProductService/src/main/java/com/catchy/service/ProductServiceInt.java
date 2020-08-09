package com.catchy.service;

import java.util.List;

import com.catchy.entity.Product;

public interface ProductServiceInt {
	
	List<Product> listAll();
	void save(Product product);
	Product get(long id);
	void delete(long id);
}
