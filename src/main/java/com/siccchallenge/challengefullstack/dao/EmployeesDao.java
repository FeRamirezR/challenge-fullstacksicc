package com.siccchallenge.challengefullstack.dao;

import org.springframework.data.repository.CrudRepository;
import com.siccchallenge.challengefullstack.entity.Employees;

public interface EmployeesDao extends CrudRepository<Employees, String>{

}
