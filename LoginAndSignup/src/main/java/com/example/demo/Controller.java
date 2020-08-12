package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Users;
import com.example.demo.service.LoginandSignupServiceImp;

@RestController
public class Controller {
	
	@Autowired
	private LoginandSignupServiceImp service;
	
	Logger logger = LoggerFactory.getLogger(LoginAndSignupApplication.class);
	
	
	
	@PostMapping("/addUser")
	public boolean createUser(@RequestBody Users users) {
		logger.info("Creating user");
		return service.registerUser(users);
	}
	

}
