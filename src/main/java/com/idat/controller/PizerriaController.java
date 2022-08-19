package com.idat.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.idat.model.Pizerria;
import com.idat.service.PizerriaService;
@RestController
@RequestMapping("/api/v1")
@CrossOrigin(origins = "*")
public class PizerriaController {
	@Autowired
	private PizerriaService serv;
	
	
	 @RequestMapping(path = "/Pizerria/listar", method = RequestMethod.GET)
	    public ResponseEntity<List<Pizerria>> listarPizerria(){
	        return new ResponseEntity<List<Pizerria>>(serv.list() , HttpStatus.CREATED);  
	    }
	 
	 
	 
	  @RequestMapping(path = "/Pizerria/guardar", method = RequestMethod.POST)
	    public ResponseEntity<Void> guardar(@RequestBody Pizerria pizerria){
	        serv.registro(pizerria);
	        return  new ResponseEntity<Void>(HttpStatus.CREATED);    
	    }

}
