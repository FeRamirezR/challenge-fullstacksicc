package com.siccchallenge.challengefullstack.dto;

public class PersonsDto {
	
	private String idPerson;
	
	private Integer doc;
	
	private String idDocType;
	
	private String name;
	
	private String lastName;
	
	private String address;
	
	private String email;
	
	private String phone;

	public String getIdPerson() {
		return idPerson;
	}

	public void setIdPerson(String idPerson) {
		this.idPerson = idPerson;
	}

	public Integer getDoc() {
		return doc;
	}

	public void setDoc(Integer doc) {
		this.doc = doc;
	}

	public String getIdDocType() {
		return idDocType;
	}

	public void setIdDocType(String idDocType) {
		this.idDocType = idDocType;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}


}
