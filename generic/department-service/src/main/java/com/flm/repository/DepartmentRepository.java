package com.flm.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.flm.entity.Department;

public interface DepartmentRepository extends JpaRepository<Department, Long>{

}
