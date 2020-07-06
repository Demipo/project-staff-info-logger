package com.example.staffloggerserver.services;

import com.example.staffloggerserver.models.Employee;
import com.example.staffloggerserver.repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class EmployeesService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public Employee save(Employee employee){
        return employeeRepository.save(employee);
    }

    public List<Employee> get(){
        return employeeRepository.findAll();
    }

    public Employee get(Integer id) throws Exception {
        return employeeRepository.findById(id).
                orElseThrow(() -> new Exception("Employee not found"));
    }

    public void delete(Integer id){
        employeeRepository.deleteById(id);
    }


}
