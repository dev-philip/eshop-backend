package com.eshopbackend.service;

import java.util.List;

import com.eshopbackend.entity.Product;

public interface ProductService {
	List<Product> getAllProducts();
	List<Product> getProductsByCategoryId(Long categoryId);
	Product getProductById(Long productId);

}
