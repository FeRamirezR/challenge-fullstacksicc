package com.siccchallenge.challengefullstack.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="employees")
public class Employees {
	
	@Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "org.hibernate.id.UUIDGenerator")
    @Column(name = "idemployee", columnDefinition = "VARCHAR(36)")
	private String idEmployee;
	
	@Column(name = "deparmentwork", columnDefinition = "VARCHAR(300)")
	private String deparmentWork;
	
	@Column(name = "dateadmission", columnDefinition = "DATE")
	private Date dateAdmission;
	
	@Column(name = "idperson", columnDefinition = "VARCHAR(36)")
	private String idPerson;

	public String getIdEmployee() {
		return idEmployee;
	}

	public void setIdEmployee(String idEmployee) {
		this.idEmployee = idEmployee;
	}

	public String getDeparmentWork() {
		return deparmentWork;
	}

	public void setDeparmentWork(String deparmentWork) {
		this.deparmentWork = deparmentWork;
	}

	public Date getDateAdmission() {
		return dateAdmission;
	}

	public void setDateAdmission(Date dateAdmission) {
		this.dateAdmission = dateAdmission;
	}

	public String getIdPerson() {
		return idPerson;
	}

	public void setIdPerson(String idPerson) {
		this.idPerson = idPerson;
	}
	
	
}
