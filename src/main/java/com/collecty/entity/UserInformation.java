package com.collecty.entity;

import org.neo4j.ogm.annotation.GraphId;
import org.neo4j.ogm.annotation.NodeEntity;

@NodeEntity
public class UserInformation {
	
	@GraphId
	private Long id;
	private String email;
	private String name;
	private Phone phone;
	public UserInformation() {
		super();
		// TODO Auto-generated constructor stub
	}
	public UserInformation(String email, String name, Phone phone) {
		super();
		this.email = email;
		this.name = name;
		this.phone = phone;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Phone getPhone() {
		return phone;
	}
	public void setPhone(Phone phone) {
		this.phone = phone;
	}
	
	

}
