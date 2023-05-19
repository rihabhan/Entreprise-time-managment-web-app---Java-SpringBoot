package com.enit.ProjectSpring11.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.enit.ProjectSpring11.Services.AgendaService;
import com.enit.ProjectSpring11.Services.AlerteService;
import com.enit.ProjectSpring11.model.Agenda;
import com.enit.ProjectSpring11.model.Alert;

@RestController

public class AlerteController {
	@Autowired
	private AlerteService alservice;
	@GetMapping("/alerts")
	public List<Alert> getAlerte()
	{
	return alservice.getAlertes();
	}
	@PostMapping("/alerts")
	public Alert  saveAlerte(@RequestBody Alert al) {
		return alservice.saveAlertes(al);
	}
}
