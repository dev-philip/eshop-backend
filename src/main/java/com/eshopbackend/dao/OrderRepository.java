package com.eshopbackend.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eshopbackend.entity.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
