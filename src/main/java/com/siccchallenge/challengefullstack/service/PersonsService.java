package com.siccchallenge.challengefullstack.service;

import java.util.List;

import com.siccchallenge.challengefullstack.commons.GenericService;
import com.siccchallenge.challengefullstack.dto.PersonsDto;
import com.siccchallenge.challengefullstack.entity.Persons;

public interface PersonsService extends GenericService<Persons, String>{

	List<PersonsDto> findAll();
	
	PersonsDto findByid(String id);
	
	PersonsDto save(PersonsDto personsDto);
	
	void delete(PersonsDto personsDto);
}
