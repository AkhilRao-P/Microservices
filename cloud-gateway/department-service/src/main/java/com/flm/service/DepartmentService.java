package com.flm.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.flm.entity.Department;
import com.flm.exception.DepartmentNotFoundException;
import com.flm.repository.DepartmentRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class DepartmentService {
	
	private final DepartmentRepository departmentRepository;
	
	@Transactional
	public Department saveDepartment(Department department){
		return departmentRepository.save(department);
	}

	public Department getDepartment(Long id) throws DepartmentNotFoundException{
		Optional<Department> optDept = departmentRepository.findById(id);
		if (optDept.isPresent()) return optDept.get();
		throw new DepartmentNotFoundException("Department is not found!!");
	}

}
