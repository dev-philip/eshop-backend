package com.eshopbackend.controller;



import org.slf4j.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.eshopbackend.entity.User;
import com.eshopbackend.service.UserService;
import com.eshopbackend.util.LoggerUtil;

@RestController
@RequestMapping("/api/v1")
public class UserController {
	private static final Logger logger = LoggerUtil.getLogger();
	
	@Autowired
    private UserService userService;
	
	 @PostMapping("/signup")
	    public ResponseEntity<String> signUp(@RequestBody User user) {
//	        logger.info("This is an informational log message.");
//	        logger.error("This is an error log message.");
	        if (userService.emailExists(user.getEmail())) {
	        	logger.error("Email already exists: {}", user.getEmail());
	        	 return ResponseEntity.status(HttpStatus.CONFLICT).body("Email already exists!");
	        } else {
	            userService.saveUser(user);
	            logger.info("User registered successfully: {}", user.getEmail());
	            return ResponseEntity.status(HttpStatus.CREATED).body("User registered successfully!");
	        }
	    }
	 
	 @GetMapping("/getuser")
	 public ResponseEntity<String> getUser() {
		 return ResponseEntity.status(HttpStatus.CREATED).body("olamideawobusuyi@gmail.com");
	 }

}
