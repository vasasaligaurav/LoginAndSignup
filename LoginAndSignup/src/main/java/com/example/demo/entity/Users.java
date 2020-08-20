package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.sun.istack.NotNull;

@Entity
@Table(name="Customer")
public class Users {
	
	@Id
	@NotNull
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Integer userId;
	
	@Column
	@NotNull
	private String firstname;
	
	@Column
	@NotNull
	private String lastname;
	
	@Column(unique = true)
	@NotNull
	private String username;
	
	@Column
	@NotNull
	private String password;

	@Column
	@NotNull
	private long phoneNumber;

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public Users(Integer userId, String firstname, String lastname, String username, String password,
			long phoneNumber) {
		super();
		this.userId = userId;
		this.firstname = firstname;
		this.lastname = lastname;
		this.username = username;
		this.password = password;
		this.phoneNumber = phoneNumber;
	}

	public Users() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
}