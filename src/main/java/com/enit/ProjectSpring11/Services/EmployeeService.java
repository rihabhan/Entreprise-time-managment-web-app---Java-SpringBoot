package com.enit.ProjectSpring11.Services;

import java.util.List;

import com.enit.ProjectSpring11.model.Employee;

public interface EmployeeService {
	List <Employee> getEmployees();
	Employee saveEmployee (Employee e);
}
