package com.siccchallenge.challengefullstack.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.siccchallenge.challengefullstack.dto.EmployeesDto;
// import com.siccchallenge.challengefullstack.jdbc.PrescriptionsJdbc;
import com.siccchallenge.challengefullstack.service.EmployeesService;

@RestController
@CrossOrigin({"*"})
@RequestMapping(value = "/employees")
public class EmployeesRest {
	
	@Autowired
	private EmployeesService employeesService;
	
	@GetMapping(value = "/all")
	public List<EmployeesDto> getAll(){
		return employeesService.findAll();
		
	}
	
	@GetMapping(value = "/get/{id}")
	public ResponseEntity<EmployeesDto> get(@PathVariable String id){
		
		return new ResponseEntity<EmployeesDto>(employeesService.findByid(id), HttpStatus.OK);
	}
	
	@PostMapping(value = "/save")
	public ResponseEntity<EmployeesDto> save(@RequestBody EmployeesDto employeesDto){
		EmployeesDto obj = employeesService.save(employeesDto);
		return new ResponseEntity<EmployeesDto>(obj, HttpStatus.ACCEPTED);
	}
	
	@DeleteMapping(value = "/delete/{id}")
	public ResponseEntity<EmployeesDto> delete(@PathVariable String id){
		EmployeesDto employeesDto = employeesService.findByid(id);
		if(employeesDto != null) {
			employeesService.delete(employeesDto);
		}else {
			return new ResponseEntity<EmployeesDto>(employeesDto, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
		return new ResponseEntity<EmployeesDto>(employeesDto, HttpStatus.OK);
		
	}
	

}
