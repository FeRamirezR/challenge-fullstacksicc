package com.siccchallenge.challengefullstack.dto;

import java.util.Date;

public class EmployeesDto {
	
	private String idEmployee;
	
	private String deparmentWork;
	
	private Date dateAdmission;
	
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
