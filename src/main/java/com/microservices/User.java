package com.microservices;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class User {
	
	@Id
    @GeneratedValue(strategy= GenerationType.AUTO)
	private Long Id;
	@Column
	private String username;
	@Column
	private String password;
	@Column
	private Double salary;
	@Column
	private Integer age;
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	

	
	public User(Long id, String username, String password, Double salary, Integer age) {
		super();
		Id = id;
		this.username = username;
		this.password = password;
		this.salary = salary;
		this.age = age;
	}
	public User() {
		
	}
	public Long getId() {
		return Id;
	}
	public void setId(Long id) {
		Id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	

}
