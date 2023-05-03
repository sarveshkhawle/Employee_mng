package com.crud.empo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.empo.entity.Emp;
import com.crud.empo.repo.Emprepo;
@Service
public class EmpService {
	
	@Autowired
	private Emprepo repo ;
public void addEmp(Emp e) {
	repo.save(e);
}
public List<Emp > getAllEmp(){
	return repo.findAll();
}

public Emp getEmpById(int id) {
	Optional<Emp> e = repo.findById(id);
	if(e.isPresent()) return e.get();
	return null;
}
public void deleteEmp(int id) {
	repo.deleteById(id);
}
}
