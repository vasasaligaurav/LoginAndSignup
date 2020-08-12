package com.example.demo.dao;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Users;

@Repository
public class LoginandSignupDaoImp {
	
	@Autowired
	private EntityManager entityManager;
	public boolean createAccount(Users ud) {

		Integer userId = 1;
		String command = "select count(ud.userId) from Users ud";
		TypedQuery<Long> query = entityManager.createQuery(command, Long.class);
		long count = query.getSingleResult();
		if (count > 0) {
			command = "select max(ud.userId) from Users ud";
			TypedQuery<Integer> query2 = entityManager.createQuery(command, Integer.class);
			Integer uid = query2.getSingleResult();
			userId = uid + 1;
		}
		ud.setUserId(userId);
		Session s = entityManager.unwrap(Session.class);
		s.saveOrUpdate(ud);
		
		return true;
	}

}
