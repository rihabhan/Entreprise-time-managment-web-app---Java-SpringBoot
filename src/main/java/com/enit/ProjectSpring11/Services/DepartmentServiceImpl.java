package com.enit.ProjectSpring11.Services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.enit.ProjectSpring11.Repository.DepartmentRepository;
import com.enit.ProjectSpring11.Repository.EmployeeRepository;
import com.enit.ProjectSpring11.model.Department;
@Service

public class DepartmentServiceImpl implements DepartmentService {
	@Autowired
	private DepartmentRepository dRepository;
	
	@Override
	public List<Department> getDepartments() {
		return dRepository.findAll();
	}

	@Override
	public Department saveDepartment(Department d) {
		
		return dRepository.save(d);
	}
	@Override
	public void deleteDepartment(int id) {
	    dRepository.deleteById(id);
	}
    @Override
    public Department getDepartmentById(int id) {
        return dRepository.findById(id).orElse(null);
    }
}
