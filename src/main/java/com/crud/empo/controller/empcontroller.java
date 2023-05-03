package com.crud.empo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.crud.empo.entity.Emp;
import com.crud.empo.service.EmpService;

import jakarta.servlet.http.HttpSession;

@Controller
public class empcontroller {
 
	@Autowired
	private EmpService serviceee;
	
	@GetMapping("/")
	public String home(Model m ) {
		
		 List<Emp> emp = serviceee.getAllEmp();
		 m.addAttribute("emp" ,emp);
		return "index";
	}
	
	 @GetMapping("/addemp") public String addEmpForm()
	 { 
	
		 return "add_emp"; 
		 }
	
	 
	 @PostMapping("/register")                             
	 public String empRegister(@ModelAttribute Emp e ) {
		 System.out.println(e);
		 serviceee.addEmp(e);
		 return "redirect:/";
	 }

@GetMapping("/edit/{id}") 
public String edit(@PathVariable int id ,Model m )
		  {
		 
	 Emp e = serviceee.getEmpById(id); m.addAttribute("emp",e); 
	 m.addAttribute("emp", e);
	 return "edit";
	 } 

@PostMapping("/update")                             
public String updateEmp(@ModelAttribute Emp e ) {
	 System.out.println(e);
	 serviceee.addEmp(e);
	 return "redirect:/";
}
@GetMapping("/delete/{id}")                             
public String deleteEmp(@PathVariable int id ) {
	serviceee.deleteEmp(id);
	 return "redirect:/";
}
}








