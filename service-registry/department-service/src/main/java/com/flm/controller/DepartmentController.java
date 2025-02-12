package com.flm.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.flm.dto.DepartmentForm;
import com.flm.entity.Department;
import com.flm.exception.DepartmentNotFoundException;
import com.flm.service.DepartmentService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class DepartmentController {
	
	private final DepartmentService departmentService;
	
	@PostMapping("/saveDepartment")
	public Department saveDepartment(@RequestBody DepartmentForm departmentForm){
		Department dept = Department.builder()
				.name(departmentForm.getName())
				.location(departmentForm.getLocation())
				.build();
		return departmentService.saveDepartment(dept);
	}

	@GetMapping("/getDepartment/{id}")
	public Department getDepartment(@PathVariable Long id) throws DepartmentNotFoundException{
		return departmentService.getDepartment(id);
	}
	
	
	@GetMapping("/getDepartment")
	public Department getDepartmentParam(@RequestParam("dept_id") Long id) throws DepartmentNotFoundException{
		return departmentService.getDepartment(id);
	}
	
}
