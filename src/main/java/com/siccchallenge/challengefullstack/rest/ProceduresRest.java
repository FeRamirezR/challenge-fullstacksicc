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

import com.siccchallenge.challengefullstack.dto.ProceduresDto;
import com.siccchallenge.challengefullstack.service.ProceduresService;

@RestController
@CrossOrigin({"*"})
@RequestMapping(value = "/procedures")
public class ProceduresRest {
	
	@Autowired
	private ProceduresService proceduresService;
	
	@GetMapping(value = "/all")
	public List<ProceduresDto> getAll(){
		return proceduresService.findAll();
		
	}
	
	@GetMapping(value = "/get/{id}")
	public ResponseEntity<ProceduresDto> get(@PathVariable String id){
		
		return new ResponseEntity<ProceduresDto>(proceduresService.findByid(id), HttpStatus.OK);
	}
	
	@PostMapping(value = "/save")
	public ResponseEntity<ProceduresDto> save(@RequestBody ProceduresDto proceduresDto){
		ProceduresDto obj = proceduresService.save(proceduresDto);
		return new ResponseEntity<ProceduresDto>(obj, HttpStatus.ACCEPTED);
	}
	
	@DeleteMapping(value = "/delete/{id}")
	public ResponseEntity<ProceduresDto> delete(@PathVariable String id){
		ProceduresDto proceduresDto = proceduresService.findByid(id);
		if(proceduresDto != null) {
			proceduresService.delete(proceduresDto);
		}else {
			return new ResponseEntity<ProceduresDto>(proceduresDto, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
		return new ResponseEntity<ProceduresDto>(proceduresDto, HttpStatus.OK);
		
	}

}
