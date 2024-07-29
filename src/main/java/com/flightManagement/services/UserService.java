package com.flightManagement.services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flightManagement.dao.UserRepository;
import com.flightManagement.models.User;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	
	public User addUser(User user) {
		return this.userRepository.save(user);
	}
	
	public User getUser(String username, String userPassword) {
		User user = null;
		try {
			user = this.userRepository.findByUserNameAndUserPassword(username, userPassword);
			System.out.println(user);
		} catch(Exception e) {
			
			e.printStackTrace();
		}
		
		return user;
	}
	
	

}
