package com.sakha.sakhaBoot;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sakha.sakhaBoot.model.Employee;
import com.sakha.sakhaBoot.service.EmployeeService;

@RestController
@RequestMapping("/api")
public class EmployeeRestController {
	
	@Autowired
	EmployeeService service;
	
	@GetMapping("/employee/{empId}")
	public Employee getEmp(@PathVariable("empId") int empId) throws Exception{
		return service.getEmployee(empId);
	}
	
	@PutMapping("/updating/{empId}")
	public void updateEmployee(@PathVariable("empID") int empId, @RequestBody Employee emp) throws Exception{
		service.UpdateEmp(emp.getSalary(), empId);
	}
	
	@DeleteMapping("/employee/{empId}")
	public void delete(@PathVariable("empId") int empId) throws Exception{
		service.deleteEmployee(empId);
	}
	
	@GetMapping("/employees")
	public List<Employee> allEmployees(Model m) throws Exception{
		
		return service.getAllEmployee();
	}
	

}
