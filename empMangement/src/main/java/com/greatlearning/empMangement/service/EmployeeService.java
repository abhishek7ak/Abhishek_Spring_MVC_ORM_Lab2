package com.greatlearning.empMangement.service;

import java.util.List;

import com.greatlearning.empMangement.entity.Employee;

public interface EmployeeService {
		List<Employee> getAllEmployees(); 
		void saveEmployee (Employee emp); 
		int deleteById(int id);
		Employee findById(int id);
}
