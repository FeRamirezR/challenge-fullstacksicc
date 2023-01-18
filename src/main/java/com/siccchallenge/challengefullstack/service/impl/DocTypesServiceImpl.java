package com.siccchallenge.challengefullstack.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.siccchallenge.challengefullstack.commons.impl.GenericServiceImpl;
import com.siccchallenge.challengefullstack.dao.DocTypesDao;
import com.siccchallenge.challengefullstack.dto.DocTypesDto;
import com.siccchallenge.challengefullstack.entity.DocTypes;
import com.siccchallenge.challengefullstack.service.DocTypesService;
import com.siccchallenge.challengefullstack.utils.MHelpers;

@Service
public class DocTypesServiceImpl extends GenericServiceImpl<DocTypes, String> implements DocTypesService{

	@Autowired 
	DocTypesDao docTypesDao;
	
	@Override
	public CrudRepository<DocTypes, String> getDao() {
		return docTypesDao;
	}
	
	@Override
	public List<DocTypesDto> findAll() {
		
		List<DocTypesDto> listaDocTypesDto = new ArrayList<>();
		
		Iterable<DocTypes> docTypesIt = this.docTypesDao.findAll();
		
		for(DocTypes docTypes: docTypesIt) {
			DocTypesDto docTypesDto = new DocTypesDto();
			docTypesDto = MHelpers.modelMapper().map(docTypes, DocTypesDto.class);
			listaDocTypesDto.add(docTypesDto);
		}
		
		return listaDocTypesDto;
	}

	@Override
	public DocTypesDto findByid(String id) {
		Optional<DocTypes> docTypes = this.docTypesDao.findById(id);
		DocTypesDto docTypesDto = MHelpers.modelMapper().map(docTypes.get(), DocTypesDto.class);
		
		return docTypesDto;
	}

	@Override
	public DocTypesDto save(DocTypesDto docTypesDto) {
		DocTypes docTypes = new DocTypes();
		docTypes = MHelpers.modelMapper().map(docTypesDto, DocTypes.class);
		docTypes =  this.docTypesDao.save(docTypes);
		docTypesDto = MHelpers.modelMapper().map(docTypes, DocTypesDto.class);
		
		return docTypesDto;
	}

	@Override
	public void delete(DocTypesDto docTypesDto) {
		DocTypes docTypes = new DocTypes();
		docTypes = MHelpers.modelMapper().map(docTypesDto, DocTypes.class);
		this.docTypesDao.delete(docTypes);
		
	}


}
