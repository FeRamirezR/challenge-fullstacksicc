package com.siccchallenge.challengefullstack.service;

import java.util.List;

import com.siccchallenge.challengefullstack.commons.GenericService;
import com.siccchallenge.challengefullstack.dto.EmployeesDto;
import com.siccchallenge.challengefullstack.entity.Employees;

public interface EmployeesService extends GenericService<Employees, String>{

	List<EmployeesDto> findAll();
	
	EmployeesDto findByid(String id);
	
	EmployeesDto save(EmployeesDto employeesDto);
	
	void delete(EmployeesDto employeesDto);
}