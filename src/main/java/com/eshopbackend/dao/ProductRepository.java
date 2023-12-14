package com.eshopbackend.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eshopbackend.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
