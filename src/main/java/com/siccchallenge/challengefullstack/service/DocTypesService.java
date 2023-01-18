package com.siccchallenge.challengefullstack.service;

import java.util.List;

import com.siccchallenge.challengefullstack.commons.GenericService;
import com.siccchallenge.challengefullstack.dto.DocTypesDto;
import com.siccchallenge.challengefullstack.entity.DocTypes;

public interface DocTypesService extends GenericService<DocTypes, String>{

	List<DocTypesDto> findAll();
	
	DocTypesDto findByid(String id);
	
	DocTypesDto save(DocTypesDto docTypesDto);
	
	void delete(DocTypesDto docTypesDto);
}
