package com.enit.ProjectSpring11.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.enit.ProjectSpring11.Services.DepartmentService;
import com.enit.ProjectSpring11.Services.EmployeeService;
import com.enit.ProjectSpring11.model.Department;
import com.enit.ProjectSpring11.model.Employee;

@Controller
public class EmployeeController {
    
	private final EmployeeService employeeService;
    private final DepartmentService departmentService;

    public EmployeeController(EmployeeService employeeService, DepartmentService departmentService) {
        this.employeeService = employeeService;
        this.departmentService = departmentService;

    }
	
    @GetMapping("/employees")
    public String getEmployees(Model model) {
        // Add your logic to fetch employee data from the database or any other source
        // For demonstration purposes, let's assume we have a list of employees
        List<Employee> employees= employeeService.getEmployees();;
        List<Department> departments = departmentService.getDepartments();

        // Add the employees to the model
        model.addAttribute("employees", employees);
        model.addAttribute("employee", new Employee()); // Add this line to provide an empty employee object
        model.addAttribute("newEmployee", new Employee()); // Add this line to provide an empty Employee object for the form
        model.addAttribute("departments", departments); // Add departments to the model

        // Return the view name (employee.html)
        return "employees";
    }
    @PostMapping("/employees")
    public String addEmployee(@ModelAttribute("newEmployee") Employee employee, Model model) {
        Department department = departmentService.getDepartmentById(employee.getDepartment().getNumDept());
        employee.setDepartment(department);
        employeeService.saveEmployee(employee);


        // Redirect to the "/employees" page to display the updated employee list
        return "redirect:/employees";
    }

    @PostMapping("/deleteEmployee")
    public String deleteEmployee(@RequestParam("numEmploye") int numEmploye) {
        employeeService.deleteEmployee(numEmploye);
        return "redirect:/employees";
    }
    @GetMapping("/updateEmployee")
    public String showUpdateEmployeeForm(@RequestParam("numEmploye") int numEmploye, Model model) {
        Employee employee = employeeService.getEmployeeById(numEmploye);
        model.addAttribute("employee", employee);
        // Add code to fetch departments and pass them to the view
        List<Department> departments = departmentService.getDepartments();
        model.addAttribute("departments", departments);
        return "update";
    }

    @PostMapping("/saveUpdatedEmployee")
    public String saveUpdatedEmployee(@ModelAttribute("employee") Employee updatedEmployee) {
        employeeService.updateEmployee(updatedEmployee);
        return "redirect:/employees";
    }

}
