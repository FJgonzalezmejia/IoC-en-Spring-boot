package com.example.h2demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.h2demo.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
