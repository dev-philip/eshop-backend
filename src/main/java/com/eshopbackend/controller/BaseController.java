package com.eshopbackend.controller;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BaseController {
	
	@GetMapping("/")
    public ResponseEntity<Map<String, String>> entry() {
        Map<String, String> response = new HashMap<>();
        response.put("message", "Welcome to eshop backend");
        response.put("description", "Your app description");
        response.put("date", LocalDate.now().toString());

        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }
	
	@GetMapping("/welcome")
	 public ResponseEntity<String> getUser() {
		 return ResponseEntity.status(HttpStatus.CREATED).body("welcome to Eshop ecommerce");
	 }

}
