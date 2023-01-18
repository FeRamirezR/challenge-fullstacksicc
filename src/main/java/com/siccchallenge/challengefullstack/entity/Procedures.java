package com.siccchallenge.challengefullstack.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="procedures")
public class Procedures {
	
	@Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "org.hibernate.id.UUIDGenerator")
    @Column(name = "idprocedure", columnDefinition = "VARCHAR(36)")
	private String idProcedure;
	
	@Column(name = "filednum", columnDefinition = "INTEGER")
	private Integer filedNum;
	
	@Column(name = "filedyear", columnDefinition = "INTEGER")
	private Integer filedYear;
	
	@Column(name = "procedurename", columnDefinition = "VARCHAR(100)")
	private String procedureName;
	
	@Column(name = "proceduredesc", columnDefinition = "VARCHAR(300)")
	private String procedureDesc;
	
	@Column(name = "idperson", columnDefinition = "VARCHAR(36)")
	private String idPerson;
	
	@Column(name = "idemployee", columnDefinition = "VARCHAR(36)")
	private String idEmployee;

	public String getIdProcedure() {
		return idProcedure;
	}

	public void setIdProcedure(String idProcedure) {
		this.idProcedure = idProcedure;
	}

	public Integer getFiledNum() {
		return filedNum;
	}

	public void setFiledNum(Integer filedNum) {
		this.filedNum = filedNum;
	}

	public Integer getFiledYear() {
		return filedYear;
	}

	public void setFiledYear(Integer filedYear) {
		this.filedYear = filedYear;
	}

	public String getProcedureName() {
		return procedureName;
	}

	public void setProcedureName(String procedureName) {
		this.procedureName = procedureName;
	}

	public String getProcedureDesc() {
		return procedureDesc;
	}

	public void setProcedureDesc(String procedureDesc) {
		this.procedureDesc = procedureDesc;
	}

	public String getIdPerson() {
		return idPerson;
	}

	public void setIdPerson(String idPerson) {
		this.idPerson = idPerson;
	}

	public String getIdEmployee() {
		return idEmployee;
	}

	public void setIdEmployee(String idEmployee) {
		this.idEmployee = idEmployee;
	}

}
