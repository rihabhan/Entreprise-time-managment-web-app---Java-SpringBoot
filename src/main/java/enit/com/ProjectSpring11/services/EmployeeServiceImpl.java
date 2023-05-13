package enit.com.ProjectSpring11.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;

import com.enit.ProjectSpring.model.Employee;
@Service
@ComponentScan
public class EmployeeServiceImpl implements EmployeeService {
	private static List<Employee> list = new ArrayList<>();
	static {
		Employee e =new Employee();
		e.setNom("ahmed");
		e.setPrenom("msakni");
		e.setTelIntern("ahla");
		e.setEmail("rihab");
		e.setNiveau(1);
		e.setNumEmploye(1);
		list.add(e);}
	@Override
	public List<Employee> getEmployees() {
		return list;
	}
	
}
	
