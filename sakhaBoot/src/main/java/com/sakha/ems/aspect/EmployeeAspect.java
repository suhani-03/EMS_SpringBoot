package com.sakha.ems.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class EmployeeAspect {
	
	@Before("execution(* com.sakha.ems.EmployeeService.deleteEmployee(..)")
	public void showDeleteLog() {
		System.out.println("Deleting...");
	}

}
