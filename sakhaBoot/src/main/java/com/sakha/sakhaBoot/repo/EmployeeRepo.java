package com.sakha.sakhaBoot.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.sakha.sakhaBoot.model.Employee;


@Repository
public interface EmployeeRepo extends JpaRepository<com.sakha.sakhaBoot.model.Employee, Integer>{

	@Query("from Employee where empName=:name")
	Employee getEmployeeByName(String name);
	
	@Transactional
	@Modifying
	@Query("update Employee set salary=:salary where empId=:empId")
	public void UpdateEmp(float salary, int empId);
	

}
