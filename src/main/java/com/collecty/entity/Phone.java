package com.collecty.entity;

import org.neo4j.ogm.annotation.GraphId;
import org.neo4j.ogm.annotation.NodeEntity;

@NodeEntity
public class Phone {
	@GraphId
	private Long id;
	private String countryCode;
	private String number;
	
	public Phone() {
		super();
	}
	public Phone(String countryCode, String number) {
		super();
		this.countryCode = countryCode;
		this.number = number;
	}
	public String getCountryCode() {
		return countryCode;
	}
	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
}
