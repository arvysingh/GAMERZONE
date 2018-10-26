package com.sports.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginContoller {

	@RequestMapping("/")
	public String showLogin() {
		return "index";
	}
}
