package com.enit.ProjectSpring11.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.enit.ProjectSpring11.Services.AgendaDeptService;
import com.enit.ProjectSpring11.model.AgendaDept;

@RestController
public class AgendaDeptController {
	@Autowired
	private AgendaDeptService agdservice;
	@GetMapping("/agendadepts")
	public List<AgendaDept> getAgendaDept()
	{
	return agdservice.getAgendaDepts();
	}
	@PostMapping("/agendadepts")
	public AgendaDept  saveAgendaDept(@RequestBody AgendaDept agdep) {
		return agdservice.saveAgendaDept(agdep);
	}
}
