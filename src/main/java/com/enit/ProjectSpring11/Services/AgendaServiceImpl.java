package com.enit.ProjectSpring11.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.enit.ProjectSpring11.Repository.AgendaRepository;
import com.enit.ProjectSpring11.model.Agenda;
@Service
public class AgendaServiceImpl implements AgendaService {
	@Autowired
	private AgendaRepository agRepository;
	@Override
	public List<Agenda> getAgendas() {
		return agRepository.findAll();
	}

	@Override
	public Agenda saveAgenda(Agenda a) {
		return agRepository.save(a);
	}

}
