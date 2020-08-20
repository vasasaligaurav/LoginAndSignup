package com.example.demo.service;

import com.example.demo.entity.Users;
import com.example.demo.exception.LoginException;

public interface LoginandSignupService {
	public boolean registerUser(Users Users);
	public Integer loginValidate(String uname, String pass) throws LoginException;

}
