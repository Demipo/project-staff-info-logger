package com.example.staffloggerserver.repositories;

import com.example.staffloggerserver.models.Employee;

import java.util.List;

public interface EmployeeDAO {
	
	List<Employee> get();
	
	Employee get(int id);
	
	void save(Employee employee);
	
	void delete(int id);
	

}
