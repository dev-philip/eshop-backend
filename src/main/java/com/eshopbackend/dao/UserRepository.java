package com.eshopbackend.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eshopbackend.entity.User;

public interface UserRepository extends JpaRepository <User, Long> {
	 User findByEmail(String email);
}
