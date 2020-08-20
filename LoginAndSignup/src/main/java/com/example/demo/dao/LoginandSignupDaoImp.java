package com.example.demo.dao;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.example.demo.entity.Users;
import com.example.demo.exception.LoginException;

@Repository
public class LoginandSignupDaoImp implements LoginandSignupDao {
	
	@Autowired
	private EntityManager entityManager;
	@Override
	public boolean createAccount(Users User) {
		entityManager.persist(User);
		return true;
	}
	
	@Override
	public Integer loginValidate(String uName, String pass) throws LoginException {

		Integer uid;
		try {
			String command = "select ud.userId from Users ud where ud.username = :uName and ud.password = :pass";
			TypedQuery<Integer> query = entityManager.createQuery(command, Integer.class);
			query.setParameter("uName", uName);
			query.setParameter("pass", pass);
			uid = 0;
			uid = query.getSingleResult();

		} catch (NoResultException e) {
			uid = 0;
		}
		return uid;
	}



}
