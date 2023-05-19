package com.enit.ProjectSpring11.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.enit.ProjectSpring11.Services.ActivitiesService;
import com.enit.ProjectSpring11.model.Activities;

@RestController
public class ActivitiesController {
	@Autowired
	private ActivitiesService actservice;
	@GetMapping("/activities")
	public List<Activities> getActivitie()
	{
	return  actservice.getActivities();
	}
	@PostMapping("/activities")
	public Activities saveActivitie(@RequestBody Activities act) {
		return actservice.saveActivities(act);
	}

}
