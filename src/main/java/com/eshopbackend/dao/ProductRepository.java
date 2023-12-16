package com.eshopbackend.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eshopbackend.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
	List<Product> findByCategory_Id(Long categoryId);

}
