package com.example.mds.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.mds.employee.model.Employee;
import com.example.mds.employee.repo.EmployeeRepository;
import com.example.mds.user.model.User;
import com.example.mds.user.repo.UserRepository;


@RestController
public class MainController {

	@Autowired
	UserRepository userRepo;

	@Autowired
	EmployeeRepository employeeRepo;
	
	@PostMapping("/Post")
	public String post(@RequestBody User u) {
		userRepo.save(u);
		Employee e = new Employee();
		e.setEname(u.getName());
		employeeRepo.save(e);
		return "Data Stored!!";
	}
	
	@GetMapping("/GetUsers")
	public List<User> getUsers (){
		return userRepo.findAll();
	}
	
	@GetMapping("/GetEmployees")
	public List<Employee> getEmployees (){
		return employeeRepo.findAll();
	}
}
