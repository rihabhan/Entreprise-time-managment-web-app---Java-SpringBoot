package com.enit.ProjectSpring11.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.enit.ProjectSpring11.Services.AgendaService;
import com.enit.ProjectSpring11.model.Agenda;
@RestController
public class AgendaController {
	@Autowired
	private AgendaService agservice;
	@GetMapping("/agendas")
	public List<Agenda> getAgenda()
	{
	return agservice.getAgendas();
	}
	@PostMapping("/agendas")
	public Agenda  saveAgenda(@RequestBody Agenda ag) {
		return agservice.saveAgenda(ag);
	}

}
