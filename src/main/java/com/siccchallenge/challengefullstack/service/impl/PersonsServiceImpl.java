package com.siccchallenge.challengefullstack.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.siccchallenge.challengefullstack.commons.impl.GenericServiceImpl;
import com.siccchallenge.challengefullstack.dao.PersonsDao;
import com.siccchallenge.challengefullstack.dto.PersonsDto;
import com.siccchallenge.challengefullstack.entity.Persons;
import com.siccchallenge.challengefullstack.service.PersonsService;
import com.siccchallenge.challengefullstack.utils.MHelpers;

@Service
public class PersonsServiceImpl extends GenericServiceImpl<Persons, String> implements PersonsService{

	@Autowired 
	PersonsDao personsDao;
	
	@Override
	public CrudRepository<Persons, String> getDao() {
		return personsDao;
	}
	
	@Override
	public List<PersonsDto> findAll() {
		
		List<PersonsDto> listaPersonsDto = new ArrayList<>();
		
		Iterable<Persons> personsIt = this.personsDao.findAll();
		
		for(Persons persons: personsIt) {
			PersonsDto personsDto = new PersonsDto();
			personsDto = MHelpers.modelMapper().map(persons, PersonsDto.class);
			listaPersonsDto.add(personsDto);
		}
		
		return listaPersonsDto;
	}

	@Override
	public PersonsDto findByid(String id) {
		Optional<Persons> persons = this.personsDao.findById(id);
		PersonsDto personsDto = MHelpers.modelMapper().map(persons.get(), PersonsDto.class);
		
		return personsDto;
	}

	@Override
	public PersonsDto save(PersonsDto personsDto) {
		Persons persons = new Persons();
		persons = MHelpers.modelMapper().map(personsDto, Persons.class);
		persons =  this.personsDao.save(persons);
		personsDto = MHelpers.modelMapper().map(persons, PersonsDto.class);
		
		return personsDto;
	}

	@Override
	public void delete(PersonsDto personsDto) {
		Persons persons = new Persons();
		persons = MHelpers.modelMapper().map(personsDto, Persons.class);
		this.personsDao.delete(persons);
		
	}


}