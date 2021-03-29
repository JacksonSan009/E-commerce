package com.example.ecommerce.controller;

import com.example.ecommerce.repository.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {
	@Autowired
	private IUserRepository repository;

	@GetMapping(value = "/login")
	public String login() {
		return "login";
	}

}

