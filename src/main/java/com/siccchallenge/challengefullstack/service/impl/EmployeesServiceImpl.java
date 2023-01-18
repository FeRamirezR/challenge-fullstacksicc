package com.siccchallenge.challengefullstack.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.siccchallenge.challengefullstack.commons.impl.GenericServiceImpl;
import com.siccchallenge.challengefullstack.dao.EmployeesDao;
import com.siccchallenge.challengefullstack.dto.EmployeesDto;
import com.siccchallenge.challengefullstack.entity.Employees;
import com.siccchallenge.challengefullstack.service.EmployeesService;
import com.siccchallenge.challengefullstack.utils.MHelpers;

@Service
public class EmployeesServiceImpl extends GenericServiceImpl<Employees, String> implements EmployeesService{

	@Autowired 
	EmployeesDao employeesDao;
	
	@Override
	public CrudRepository<Employees, String> getDao() {
		return employeesDao;
	}
	
	@Override
	public List<EmployeesDto> findAll() {
		
		List<EmployeesDto> listaEmployeesDto = new ArrayList<>();
		
		Iterable<Employees> employeesIt = this.employeesDao.findAll();
		
		for(Employees employees: employeesIt) {
			EmployeesDto employeesDto = new EmployeesDto();
			employeesDto = MHelpers.modelMapper().map(employees, EmployeesDto.class);
			listaEmployeesDto.add(employeesDto);
		}
		
		return listaEmployeesDto;
	}

	@Override
	public EmployeesDto findByid(String id) {
		Optional<Employees> employees = this.employeesDao.findById(id);
		EmployeesDto employeesDto = MHelpers.modelMapper().map(employees.get(), EmployeesDto.class);
		
		return employeesDto;
	}

	@Override
	public EmployeesDto save(EmployeesDto employeesDto) {		
		
		Employees employees = new Employees();
		employees = MHelpers.modelMapper().map(employeesDto, Employees.class);
		employees =  this.employeesDao.save(employees);
		employeesDto = MHelpers.modelMapper().map(employees, EmployeesDto.class);				
		
		return employeesDto;
	}

	@Override
	public void delete(EmployeesDto employeesDto) {
		Employees employees = new Employees();
		employees = MHelpers.modelMapper().map(employeesDto, Employees.class);
		this.employeesDao.delete(employees);
		
	}


}