package com.greatlearning.empMangement.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.greatlearning.empMangement.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {


}
