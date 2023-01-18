package com.siccchallenge.challengefullstack.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.siccchallenge.challengefullstack.commons.impl.GenericServiceImpl;
import com.siccchallenge.challengefullstack.dao.ProceduresDao;
import com.siccchallenge.challengefullstack.dto.ProceduresDto;
import com.siccchallenge.challengefullstack.entity.Procedures;
import com.siccchallenge.challengefullstack.service.ProceduresService;
import com.siccchallenge.challengefullstack.utils.MHelpers;

@Service
public class ProceduresServiceImpl extends GenericServiceImpl<Procedures, String> implements ProceduresService{

	@Autowired 
	ProceduresDao proceduresDao;
	
	@Override
	public CrudRepository<Procedures, String> getDao() {
		return proceduresDao;
	}
	
	@Override
	public List<ProceduresDto> findAll() {
		
		List<ProceduresDto> listaProceduresDto = new ArrayList<>();
		
		Iterable<Procedures> proceduresIt = this.proceduresDao.findAll();
		
		for(Procedures procedures: proceduresIt) {
			ProceduresDto proceduresDto = new ProceduresDto();
			proceduresDto = MHelpers.modelMapper().map(procedures, ProceduresDto.class);
			listaProceduresDto.add(proceduresDto);
		}
		
		return listaProceduresDto;
	}

	@Override
	public ProceduresDto findByid(String id) {
		Optional<Procedures> procedures = this.proceduresDao.findById(id);
		ProceduresDto proceduresDto = MHelpers.modelMapper().map(procedures.get(), ProceduresDto.class);
		
		return proceduresDto;
	}

	@Override
	public ProceduresDto save(ProceduresDto proceduresDto) {
		Procedures procedures = new Procedures();
		procedures = MHelpers.modelMapper().map(proceduresDto, Procedures.class);
		procedures =  this.proceduresDao.save(procedures);
		proceduresDto = MHelpers.modelMapper().map(procedures, ProceduresDto.class);
		
		return proceduresDto;
	}

	@Override
	public void delete(ProceduresDto proceduresDto) {
		Procedures procedures = new Procedures();
		procedures = MHelpers.modelMapper().map(proceduresDto, Procedures.class);
		this.proceduresDao.delete(procedures);
		
	}


}