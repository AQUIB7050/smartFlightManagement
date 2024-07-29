package com.flightManagement.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.flightManagement.models.User;
import com.flightManagement.services.UserService;

import jakarta.validation.Valid;

@Controller
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@PostMapping("/register")
	public String registerUser(@Valid @ModelAttribute User user, BindingResult result){
		if(result.hasErrors()) {
			System.out.println(result);
			return "register";
		}
		User addedUser = userService.addUser(user);
		System.out.println(addedUser);
		return "registeredUser";
	}
	
	
	@PostMapping("/processSignIn")
	public String processSignIn(@RequestParam("userName") String userName, @RequestParam("userPassword") String password) {
		try{
			User user = this.userService.getUser(userName, password);
			if(user ==  null) return "signIn_error";
			if(user.getUserName().equals(userName) && user.getUserPassword().equals(password)) {
				return "signIn_success";
			} else return "signIn_error";
			
		} catch(Exception ex) {
			ex.printStackTrace();
			return "signIn_error";
		}
	}
	
	

}
