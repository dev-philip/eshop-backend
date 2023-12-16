package com.eshopbackend.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eshopbackend.dao.OrderRepository;
import com.eshopbackend.entity.Order;
import com.eshopbackend.service.OrderService;

@Service
public class OrderServiceImpl implements OrderService{
	
	  private final OrderRepository orderRepository;

	    @Autowired
	    public OrderServiceImpl(OrderRepository orderRepository) {
	        this.orderRepository = orderRepository;
	    }

	    public Order saveOrder(Order order) {
	        return orderRepository.save(order);
	    }

}
