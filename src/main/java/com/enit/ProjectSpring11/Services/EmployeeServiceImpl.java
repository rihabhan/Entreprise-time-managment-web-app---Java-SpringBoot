package com.enit.ProjectSpring11.Services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.enit.ProjectSpring.model.Employee;
import com.enit.ProjectSpring11.Repository.EmployeeRepository;
@Service
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	private EmployeeRepository eRepository;
	@Override
	public List<Employee> getEmployees() {
		return eRepository.findAll() ;
	}

}
