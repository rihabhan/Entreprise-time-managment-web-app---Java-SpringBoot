package com.enit.ProjectSpring11.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.enit.ProjectSpring11.Services.ActivitesDeptService;
import com.enit.ProjectSpring11.model.ActivitiesDept;

@RestController
public class ActivitiesDeptController {
	@Autowired
	private ActivitesDeptService actdepservice;
	@GetMapping("/activitiesdepts")
	public List<ActivitiesDept> getActivitiesDept()
	{
	return actdepservice.getActivitesDepts();
	}
	@PostMapping("/activitiesdepts")
	public ActivitiesDept  saveActivitiesDept(@RequestBody ActivitiesDept actdept) {
		return actdepservice.saveActivitesDept(actdept);
	}
}
