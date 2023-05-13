package com.enit.ProjectSpring11.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.enit.ProjectSpring11.Services.ProcessVerbalService;
import com.enit.ProjectSpring11.model.AgendaDept;
import com.enit.ProjectSpring11.model.ProcessVerbal;

@RestController
public class ProcessVerbalController {
	@Autowired
	private ProcessVerbalService pvservice;
	@GetMapping("/processverbals")
	public List<ProcessVerbal> getProcessVerbal()
	{
	return pvservice.getProcessVerbals();
	}
	@PostMapping("/processverbals")
	public ProcessVerbal  saveAgendaDept(@RequestBody ProcessVerbal pv) {
		return pvservice.saveProcessVerbal(pv);
	}
}
