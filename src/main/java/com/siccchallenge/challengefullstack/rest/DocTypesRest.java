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

import com.siccchallenge.challengefullstack.dto.DocTypesDto;
import com.siccchallenge.challengefullstack.service.DocTypesService;

@RestController
@CrossOrigin({"*"})
@RequestMapping(value = "/docTypes")
public class DocTypesRest {
	@Autowired
	private DocTypesService docTypesService;
	
	@GetMapping(value = "/all")
	public List<DocTypesDto> getAll(){
		return docTypesService.findAll();
		
	}
	
	@GetMapping(value = "/get/{id}")
	public ResponseEntity<DocTypesDto> get(@PathVariable String id){
		
		return new ResponseEntity<DocTypesDto>(docTypesService.findByid(id), HttpStatus.OK);
	}
	
	@PostMapping(value = "/save")
	public ResponseEntity<DocTypesDto> save(@RequestBody DocTypesDto docTypesDto){
		DocTypesDto obj = docTypesService.save(docTypesDto);
		return new ResponseEntity<DocTypesDto>(obj, HttpStatus.ACCEPTED);
	}
	
	@DeleteMapping(value = "/delete/{id}")
	public ResponseEntity<DocTypesDto> delete(@PathVariable String id){
		DocTypesDto docTypesDto = docTypesService.findByid(id);
		if(docTypesDto != null) {
			docTypesService.delete(docTypesDto);
		}else {
			return new ResponseEntity<DocTypesDto>(docTypesDto, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
		return new ResponseEntity<DocTypesDto>(docTypesDto, HttpStatus.OK);
		
	}
}
