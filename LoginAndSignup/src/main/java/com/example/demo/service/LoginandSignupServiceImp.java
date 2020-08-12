package com.example.demo.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.LoginandSignupDaoImp;
import com.example.demo.entity.Users;

@Service
@Transactional
public class LoginandSignupServiceImp {
	@Autowired
	private LoginandSignupDaoImp daoObject;
	public boolean registerUser(Users Users) {

		return daoObject.createAccount(Users);
	}

}
