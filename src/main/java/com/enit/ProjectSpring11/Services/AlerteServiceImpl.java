package com.enit.ProjectSpring11.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.enit.ProjectSpring11.Repository.AlerteRepository;
import com.enit.ProjectSpring11.model.Alert;
@Service
public class AlerteServiceImpl implements AlerteService {
	@Autowired
	private AlerteRepository alRepository;
	
	@Override
	public List<Alert> getAlertes() {
		// TODO Auto-generated method stub
		return alRepository.findAll();
	}

	@Override
	public Alert saveAlertes(Alert a) {
		// TODO Auto-generated method stub
		return alRepository.save(a);
	}

}
