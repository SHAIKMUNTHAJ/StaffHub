package com.vcube.addressservice.response;

import lombok.Data;


public class AddressResponse {
	private Integer id;
	private String city;
	private String state;
	public  AddressResponse(){
		
	}
	public AddressResponse(Integer id, String city, String state) {
		super();
		this.id = id;
		this.city = city;
		this.state = state;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	

}
