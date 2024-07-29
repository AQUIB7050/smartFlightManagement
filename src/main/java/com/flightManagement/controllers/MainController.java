package com.flightManagement.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.flightManagement.models.Flight;
import com.flightManagement.models.User;

@Controller
public class MainController {
	
	@GetMapping("/")
	public String access(Model model) {
		model.addAttribute("title", "Home - Flight Management System");
		model.addAttribute("flight", new Flight());
		return "access";
	}
	
	
	@GetMapping("/register")
	public String register(Model model) {
		model.addAttribute("user", new User());
		return "register";
	}
	
	@GetMapping("/signIn")
	public String signIn() {
		return "signIn";
	}
	
	@PostMapping("/message")
	public String mesaageHandler() {
		return "message_success";
	}
	
	
}
