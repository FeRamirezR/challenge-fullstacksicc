package com.siccchallenge.challengefullstack.service;

import java.util.List;

import com.siccchallenge.challengefullstack.commons.GenericService;
import com.siccchallenge.challengefullstack.dto.ProceduresDto;
import com.siccchallenge.challengefullstack.entity.Procedures;

public interface ProceduresService extends GenericService<Procedures, String>{

	List<ProceduresDto> findAll();
	
	ProceduresDto findByid(String id);
	
	ProceduresDto save(ProceduresDto proceduresDto);
	
	void delete(ProceduresDto proceduresDto);
}
