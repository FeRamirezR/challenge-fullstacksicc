package com.siccchallenge.challengefullstack.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="doctypes")
public class DocTypes {
	
	@Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "org.hibernate.id.UUIDGenerator")
    @Column(name = "iddoctype", columnDefinition = "VARCHAR(36)")
	private String idDocType;
	
	@Column(name = "doctype", columnDefinition = "VARCHAR(10)")
	private String docType;
	
	@Column(name = "countrycode", columnDefinition = "VARCHAR(3)")
	private String countryCode;
	
	@Column(name = "description", columnDefinition = "VARCHAR(100)")
	private String description;

	public String getIdDocType() {
		return idDocType;
	}

	public void setIdDocType(String idDocType) {
		this.idDocType = idDocType;
	}

	public String getDocType() {
		return docType;
	}

	public void setDocType(String docType) {
		this.docType = docType;
	}

	public String getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
