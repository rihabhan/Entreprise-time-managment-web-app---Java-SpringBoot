package com.enit.ProjectSpring11.Services;

import java.util.List;

import com.enit.ProjectSpring11.model.Agenda;

public interface AgendaService {
	List <Agenda> getAgendas();
	Agenda saveAgenda (Agenda a);
}
