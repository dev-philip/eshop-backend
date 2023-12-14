package com.eshopbackend.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.eshopbackend.entity.User;
//import org.springframework.security.core.userdetails.User;
import com.eshopbackend.dao.UserRepository;

import com.eshopbackend.service.UserService;


@Service
public class UserServiceImpl implements UserService {
	
	 @Autowired
	 private UserRepository userRepository;
	 
	 @Autowired
	 private PasswordEncoder passwordEncoder;
	 
	 @Override
	    public void saveUser(User user) {
	        user.setPassword(passwordEncoder.encode(user.getPassword()));
	        userRepository.save(user);
	    }

	    @Override
	    public boolean emailExists(String email) {
	    	User user = userRepository.findByEmail(email);
	        return user != null;
	    }
	    

}
