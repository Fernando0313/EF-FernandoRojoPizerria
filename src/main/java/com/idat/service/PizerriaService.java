package com.idat.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.idat.model.Pizerria;
import com.idat.repository.PizerriaRepository;
@Service
public class PizerriaService {

	@Autowired
	PizerriaRepository repo;
	
	public void registro(Pizerria p) {
		repo.save(p);
	}
	
	public List<Pizerria> list(){
		return repo.findAll();
	}
}
