package com.eshopbackend.service;

import com.eshopbackend.entity.User;

public interface UserService {
	void saveUser(User user);
    boolean emailExists(String email);
}
