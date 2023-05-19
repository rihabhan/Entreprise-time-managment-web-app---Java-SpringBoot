package com.enit.ProjectSpring11.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.enit.ProjectSpring11.Services.ActivitesDeptService;
import com.enit.ProjectSpring11.Services.AgendaDeptService;
import com.enit.ProjectSpring11.model.ActivitiesDept;
import com.enit.ProjectSpring11.model.AgendaDept;

@Controller
public class ActivitiesDeptController {
	@Autowired
	private ActivitesDeptService actdepservice;
	@GetMapping("/activitiesdepts")
	public String getActivitiesDept(Model model) {
	    List<ActivitiesDept> activitiesDepts = actdepservice.getActivitesDepts();
	    model.addAttribute("activitiesdepts", activitiesDepts);
	    return "activitiesdepts";
	
	}
	@PostMapping("/activitiesdepts")
	public ActivitiesDept  saveActivitiesDept(@RequestBody ActivitiesDept actdept) {
		return actdepservice.saveActivitesDept(actdept);
	}
}
