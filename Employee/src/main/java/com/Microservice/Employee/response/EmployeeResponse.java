package com.Microservice.Employee.response;

public class EmployeeResponse {
	private Integer id;
	private String name;
	private String email;
	private Integer age;
	
	private AddressResponse addressResponse;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public AddressResponse getAddressReponse() {
		return addressResponse;
	}
	public void setAddressReponse(AddressResponse addressResponse) {
		this.addressResponse = addressResponse;
	}

}
