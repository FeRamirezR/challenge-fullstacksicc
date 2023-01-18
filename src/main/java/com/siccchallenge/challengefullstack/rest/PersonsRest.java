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

import com.siccchallenge.challengefullstack.dto.PersonsDto;
import com.siccchallenge.challengefullstack.service.PersonsService;

@RestController
@CrossOrigin({"*"})
@RequestMapping(value = "/persons")
public class PersonsRest {

	@Autowired
	private PersonsService personsService;
	
	@GetMapping(value = "/all")
	public List<PersonsDto> getAll(){
		return personsService.findAll();
		
	}
	
	@GetMapping(value = "/get/{id}")
	public ResponseEntity<PersonsDto> get(@PathVariable String id){
		
		return new ResponseEntity<PersonsDto>(personsService.findByid(id), HttpStatus.OK);
	}
	
	@PostMapping(value = "/save")
	public ResponseEntity<PersonsDto> save(@RequestBody PersonsDto personsDto){
		PersonsDto obj = personsService.save(personsDto);
		return new ResponseEntity<PersonsDto>(obj, HttpStatus.ACCEPTED);
	}
	
	@DeleteMapping(value = "/delete/{id}")
	public ResponseEntity<PersonsDto> delete(@PathVariable String id){
		PersonsDto personsDto = personsService.findByid(id);
		if(personsDto != null) {
			personsService.delete(personsDto);
		}else {
			return new ResponseEntity<PersonsDto>(personsDto, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
		return new ResponseEntity<PersonsDto>(personsDto, HttpStatus.OK);
		
	}
}
