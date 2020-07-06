package com.example.staffloggerserver.controllers;

import java.util.List;

import com.example.staffloggerserver.models.Employee;
import com.example.staffloggerserver.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;

	@RequestMapping(path = "/employee", method = RequestMethod.POST)
	public Employee save(@RequestBody Employee employee) {
		employeeService.save(employee);
		return employee;
	}
	
	@RequestMapping(path = "/employee", method = RequestMethod.GET)
	public List<Employee> get() {
		return employeeService.get();
	}

	@RequestMapping(path = "/employee/{id}", method = RequestMethod.GET)
	public Employee get(@PathVariable int id) {
		return employeeService.get(id);
	}

	@RequestMapping(path = "/employee/{id}", method = RequestMethod.PUT)
	public Employee update(@RequestBody Employee employee) {
		employeeService.save(employee);
		return employee;
	}

	@RequestMapping(path = "/employee/{id}", method = RequestMethod.DELETE)
	public String delete(@PathVariable int id) {
		employeeService.delete(id);
		return "Employee removed with id "+id;
		
	}

} 
