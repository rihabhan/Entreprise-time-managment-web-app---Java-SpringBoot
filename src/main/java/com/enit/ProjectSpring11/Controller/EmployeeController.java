package com.enit.ProjectSpring11.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.enit.ProjectSpring11.Services.EmployeeService;
import com.enit.ProjectSpring11.model.Employee;


//@Controller
@RestController //@Controller +ResponseBody
public class EmployeeController {
	@Autowired
	private EmployeeService eservice;
	/*@Value("${app.Name}") 
	private String appName;
	@Value("${app.Version}")
	private String appVersion;
	@GetMapping("/version")
	public String getAppDetails() {
		return appName+"------"+appVersion;
		
	}*/
//localhost:8886/employees
@GetMapping("/employees")
public List<Employee> getEmployees() {
return eservice.getEmployees();
}
//localhost:8886/employees/idnumberProvided
@GetMapping("/employees/{id}")
public String getEmployees(@PathVariable("id") int id )
{
return "fetching the emplyee details for the id "+ id;
}	
@PostMapping("/employees")
public Employee saveEmployees(@RequestBody Employee employee) {
	return eservice.saveEmployee(employee);
}
//localhost:8886/employees?id=idnumberProvided
@DeleteMapping("/employees")
public String deleteEmployee(@RequestParam("id") int id) {
	return "deleting the emplyee details for the id "+ id;
}
@PutMapping("/employees/{id}")
public Employee updateEmployee(@PathVariable("id") int id, @RequestBody Employee employee)
{ 	System.out.println("updateeeeeeeeeed");
	return employee;
	}


}
