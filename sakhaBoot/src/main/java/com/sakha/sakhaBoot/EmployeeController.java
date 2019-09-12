package com.sakha.sakhaBoot;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.sakha.sakhaBoot.service.*;
import com.sakha.sakhaBoot.model.*;


@Controller
public class EmployeeController {
	
	@Autowired
	EmployeeService service;
	
	@PostMapping("/employee")
	public String saveEmployee(@ModelAttribute Employee emp, Model m) {
		
		Employee savedEmp = service.save(emp);
		m.addAttribute("emp", savedEmp);
		return "successful";
	}
	
	@GetMapping("/byname")
	public String employeeName(@RequestParam("empName") String name, Model m) {
		Employee savedName=service.getByName(name);
		m.addAttribute("savedName", savedName);
		return "view";
	}
	
	@GetMapping("/delete")
	public String deleteEmployee(@RequestParam("empId") int id, Model m) {
		service.deleteEmployee(id);
		return "deletedemp";
	}
	
	
	
//	@PostMapping("/update")
//	public String update(@RequestParam("empId") int empId, Model m) {
//		Employee emp = service.getEmployee(empId);
//		if(emp!=null) {
//			m.addAttribute("empId", empId);
//			return "updateemp";
//		}
//		else {
//			return "failure";
//		}
//	}
	
	@PostMapping("/update")
	public String updateEmployee(@RequestParam("salary") float salary, @RequestParam("empId") int id, Model m) {
		
		service.UpdateEmp(salary, id);
		return "updateemp";
	}
	
	@GetMapping("/employees")
	public String allEmployees(Model m){
		
		List<Employee> getEmp=service.getAllEmployee();
		m.addAttribute("getEmp", getEmp);
		return "getAllEmp";
	}
	
}
