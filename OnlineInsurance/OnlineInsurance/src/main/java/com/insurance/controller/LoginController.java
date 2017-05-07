package com.insurance.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LoginController {
	@RequestMapping(value = "/login", method=RequestMethod.GET)
	public String sayHello() {
		return "home";
	}
	
	
	@RequestMapping(value = "/login2", method=RequestMethod.GET)
	@ResponseBody
	public String sayHello2() {
		return "Fuck you hard.";
	}
}
