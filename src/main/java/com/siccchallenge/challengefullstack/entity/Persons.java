package com.siccchallenge.challengefullstack.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="persons")
public class Persons {
	
	@Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "org.hibernate.id.UUIDGenerator")
    @Column(name = "idperson", columnDefinition = "VARCHAR(36)")
	private String idPerson;
	
	@Column(name = "doc", columnDefinition = "INTEGER")
	private Integer doc;
	
	@Column(name = "iddoctype", columnDefinition = "VARCHAR(36)")
	private String idDocType;
	
	@Column(name = "name", columnDefinition = "VARCHAR(100)")
	private String name;
	
	@Column(name = "lastname", columnDefinition = "VARCHAR(100)")
	private String lastName;
	
	@Column(name = "address", columnDefinition = "VARCHAR(100)")
	private String address;
	
	@Column(name = "email", columnDefinition = "VARCHAR(100)")
	private String email;
	
	@Column(name = "phone", columnDefinition = "VARCHAR(20)")
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
