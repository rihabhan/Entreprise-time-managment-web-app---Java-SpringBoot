package com.enit.ProjectSpring11.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.enit.ProjectSpring11.Services.DepartmentService;
import com.enit.ProjectSpring11.model.Department;
@Controller
public class DepartmentController {
	
	
	
	@Autowired
	private DepartmentService dservice;
	@GetMapping("/departments")
	public String getDepartment(Model model) {
	    List<Department> departments = dservice.getDepartments();
	    model.addAttribute("departments", departments);
	    return "departments";
	}

	@PostMapping("/departments")
	public String saveDepartment(@ModelAttribute Department department) {
	    dservice.saveDepartment(department);
	    return "redirect:/departments";
	}
	@DeleteMapping("/departments/{id}")
	public String deleteDepartment(@PathVariable int id) {
	    dservice.deleteDepartment(id);
	    return "redirect:/departments";
	}
    @PostMapping("/deleteDepartment")
    public String deleteEmployee(@RequestParam("numDept") int numDept) {
    	dservice.deleteDepartment(numDept);
    	return "redirect:/departments";
    }

	    @GetMapping("/departments/{id}/edit")
	    public String editDepartmentForm(@PathVariable int id, Model model) {
	        Department department = dservice.getDepartmentById(id);
	        model.addAttribute("department", department);
	        return "editDepartment";
	    }

	    @PostMapping("/departments/{id}")
	    public String updateDepartment(@PathVariable("id") int id, @ModelAttribute Department department) {
	        department.setNumDept(id);
	        dservice.saveDepartment(department);
	        return "redirect:/departments";
	    }

	    


	

}
