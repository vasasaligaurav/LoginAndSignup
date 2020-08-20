package com.example.demo.dao;

import com.example.demo.entity.Users;
import com.example.demo.exception.LoginException;

public interface LoginandSignupDao {
	public boolean createAccount(Users User);
	public Integer loginValidate(String uName, String pass) throws LoginException;

}
