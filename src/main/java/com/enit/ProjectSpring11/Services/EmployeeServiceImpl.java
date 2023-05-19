package com.enit.ProjectSpring11.Services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.enit.ProjectSpring11.Repository.EmployeeRepository;
import com.enit.ProjectSpring11.model.Employee;
@Service
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	private EmployeeRepository eRepository;
	@Override
	public List<Employee> getEmployees() {
		return eRepository.findAll() ;
	}
	@Override
	public Employee saveEmployee(Employee e) {
		return eRepository.save(e);
	}
	@Override
	public void deleteEmployee(int numEmploye) {
		// TODO Auto-generated method stub
		eRepository.deleteById(numEmploye);
	}
    @Override
    public Employee getEmployeeById(int numEmploye) {
        return eRepository.findById(numEmploye)
                .orElseThrow(() -> new RuntimeException("Employee not found"));
    }

    @Override
    public void updateEmployee(Employee employee) {
        eRepository.save(employee);
    }


}
