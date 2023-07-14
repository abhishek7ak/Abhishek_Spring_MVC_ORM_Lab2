package com.greatlearning.empMangement.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.greatlearning.empMangement.entity.Employee;
import com.greatlearning.empMangement.service.EmployeeService;

@Controller
@RequestMapping("/employees")
public class EmployeeController {
 
	
	@Autowired
	EmployeeService service;
	
	/*
	*    /employees/ --- GET
	*    /employees/New --- GET
	*    /employees/edit/{id} ---GET
	*    /employees/delete/{id} ---- GET
	*    /employees/save ---- POST  
	*    /employees/save/{id} ---POST
	*/
	
	@GetMapping("/")
	public String getAllEmployees(Model model) {
		model.addAttribute("employees", service.getAllEmployees());
		return "employee";
	}

	@GetMapping("/new")
	public String addAllEmployees(Model model) {
		model.addAttribute("employee", new Employee());
		return "create_emp";
	}
	@GetMapping("/edit/{id}")
	public String editAllEmployees(@PathVariable(name ="id") Integer id, Model model) {
		model.addAttribute("employee", service.findById(id));
		return "edit_emp";
	}
	@GetMapping("/delete/{id}")
	public String deleteAllEmployees(@PathVariable(name ="id") Integer id) {
		service.deleteById(id);
		return "redirect:/employees";
	}
	@PostMapping("/save")
	public String createAllEmployees(@ModelAttribute(name = "Employee") Employee emp) {
		service.saveEmployee(emp);
		return "redirect:/employees";
	}
	@PostMapping("/save/{id}")
	public String createAllEmployees(@PathVariable(name ="id") Integer id, @ModelAttribute(name = "employee") Employee emp) {
		emp.setEmpid(id);
		service.saveEmployee(emp);
		return "redirect:/employees";
	}
}
