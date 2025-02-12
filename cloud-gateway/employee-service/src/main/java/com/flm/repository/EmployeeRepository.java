package com.flm.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.flm.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
