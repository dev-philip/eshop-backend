package com.eshopbackend.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.eshopbackend.dto.OrderRequest;
import com.eshopbackend.entity.Order;
import com.eshopbackend.service.impl.OrderServiceImpl;


@RestController
@RequestMapping("/api/v1")
public class OrderController {
	
private final OrderServiceImpl orderServiceImpl;
	
	@Autowired
    public OrderController(OrderServiceImpl orderServiceImpl) {
        this.orderServiceImpl = orderServiceImpl;
    }
	
	
	@PostMapping("/order")
	public ResponseEntity<Map<String, Object>> saveOrders(@RequestBody List<OrderRequest> orderRequests) {
	    List<Order> savedOrders = new ArrayList<>();

	    for (OrderRequest orderRequest : orderRequests) {
	        Order order = createOrderFromRequest(orderRequest);
	        Order savedOrder = orderServiceImpl.saveOrder(order);
	        savedOrders.add(savedOrder);
	    }

	    Map<String, Object> response = new HashMap<>();
	    response.put("status", true);
	    response.put("message", "Orders successfully created");

	    return new ResponseEntity<Map<String, Object>>(response, HttpStatus.CREATED);
	}
	
	 private Order createOrderFromRequest(OrderRequest orderRequest) {
	        // Create an Order object from the OrderRequest
	        // You can customize this method based on your requirements
	        return new Order(
	                null,
	                orderRequest.getFirstName(),
	                orderRequest.getLastName(),
	                orderRequest.getPrimaryEmail(),
	                orderRequest.getShip_address1(),
	                orderRequest.getShip_address2(),
	                orderRequest.getShip_country(),
	                orderRequest.getShip_state(),
	                orderRequest.getShip_zip(),
	                generateOrderKeyId(), // You may need to implement a method to generate order key
	                orderRequest.getProductCount(),
	                orderRequest.getProductOrderid(),
	                null, // The dateCreated will be automatically set by the database
	                null  // The lastUpdated will be automatically set by the database
	        );
	    }

	    private String generateOrderKeyId() {
	        // Implement logic to generate a unique order key
	        // You may use UUID.randomUUID().toString() for simplicity
	        return UUID.randomUUID().toString();
	    }

}
