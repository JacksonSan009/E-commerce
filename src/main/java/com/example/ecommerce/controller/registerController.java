package com.example.ecommerce.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class registerController {
	@GetMapping(value = "/register")
	public String register() {
		return "register";
	}
}
