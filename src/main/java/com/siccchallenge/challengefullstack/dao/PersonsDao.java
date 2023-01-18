package com.siccchallenge.challengefullstack.dao;

import org.springframework.data.repository.CrudRepository;
import com.siccchallenge.challengefullstack.entity.Persons;

public interface PersonsDao extends CrudRepository<Persons, String>{

}
