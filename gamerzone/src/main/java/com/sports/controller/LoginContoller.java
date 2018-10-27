package com.sports.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginContoller {

	@GetMapping("/")
	public String showLogin() {
		return "/index";
	}
}
