package com.enit.ProjectSpring11.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.enit.ProjectSpring11.Repository.AgendaDeptRepository;
import com.enit.ProjectSpring11.model.AgendaDept;
@Service
public class AgendaDeptServiceImpl implements AgendaDeptService {
	@Autowired
	private AgendaDeptRepository agdRepository;
	@Override
	public List<AgendaDept> getAgendaDepts() {
		return agdRepository.findAll();
	}

	@Override
	public AgendaDept saveAgendaDept(AgendaDept agd) {
		return agdRepository.save(agd);
	}

}
