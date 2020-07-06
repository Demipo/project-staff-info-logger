package com.example.staffloggerserver.repositories;

import com.example.staffloggerserver.models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
