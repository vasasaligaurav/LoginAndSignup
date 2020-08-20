package com.example.demo.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.LoginandSignupDao;
import com.example.demo.entity.Users;
import com.example.demo.exception.LoginException;

@Service
@Transactional
public class LoginandSignupServiceImp implements LoginandSignupService {
	@Autowired
	private LoginandSignupDao daoObject;
	
	@Override
	public boolean registerUser(Users Users) {
		return daoObject.createAccount(Users);
	}
	
	@Override
	public Integer loginValidate(String uname, String pass) throws LoginException {
		
//		Integer uid;
		return daoObject.loginValidate(uname, pass);
//		if(uid!=0)
//		{
//			return uid;
//		}
//		else
//		{
//			throw new LoginException("Username and Password are incorrect (or)if not registered please sign up");
//			
//		}
	}
}
