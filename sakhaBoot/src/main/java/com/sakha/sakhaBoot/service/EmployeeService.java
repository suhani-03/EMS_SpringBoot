package com.sakha.sakhaBoot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sakha.sakhaBoot.model.Employee;
import com.sakha.sakhaBoot.repo.EmployeeRepo;

@Service
public class EmployeeService {
	
	@Autowired
	EmployeeRepo repo;
	
	public Employee save(Employee emp) {
		return repo.save(emp); 
	}
	
	public Employee getEmployee(int empId) {
		return repo.getOne(empId);
	}
	
	public List<Employee> getAllEmployee(){
		return repo.findAll();
	}
	
	public void deleteEmployee(int empId) {
		repo.deleteById(empId);
	}


	public Employee getByName(String name) {
		return repo.getEmployeeByName(name);
	}

	public void UpdateEmp(float salary, int empId) {
		repo.UpdateEmp(salary, empId);
		
	}

}
