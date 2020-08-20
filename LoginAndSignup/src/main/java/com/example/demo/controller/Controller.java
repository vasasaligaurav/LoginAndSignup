package com.example.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.LoginAndSignupApplication;
import com.example.demo.entity.Users;
import com.example.demo.exception.LoginException;
import com.example.demo.service.LoginandSignupService;

@RestController
public class Controller {
	
	@Autowired
	private LoginandSignupService service;
	
	Logger logger = LoggerFactory.getLogger(LoginAndSignupApplication.class);
	
	
	
	@PostMapping("/accounts/addUser")
	@CrossOrigin
	public boolean createUser(@RequestBody Users users){
		logger.info("Creating user");
		return service.registerUser(users);
	}
	@GetMapping("/accounts/login/{uName}/{pass}")
	@CrossOrigin
	public Integer login(@PathVariable String uName, @PathVariable String pass) throws LoginException {
		logger.info("LogIn");
		return service.loginValidate(uName, pass);
	}
	

}
