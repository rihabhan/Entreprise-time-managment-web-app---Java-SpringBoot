package com.enit.ProjectSpring11.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.enit.ProjectSpring11.Services.DepartmentService;
import com.enit.ProjectSpring11.model.Department;
@RestController
public class DepartmentController {
	
	
	
	@Autowired
	private DepartmentService dservice;
	@GetMapping("/departments")
	public List<Department> getDepartment()
	{
	return dservice.getDepartments();
	}	
	
	
	
	
	@PostMapping("/departments")
	public Department saveEmployees(@RequestBody Department dep) {
		return dservice.saveDepartment(dep);
	}
}
