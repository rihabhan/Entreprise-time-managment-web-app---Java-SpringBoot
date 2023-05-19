package com.enit.ProjectSpring11.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.enit.ProjectSpring11.Repository.ActivitiesRepository;
import com.enit.ProjectSpring11.model.Activities;
@Service
public class ActivitiesServiceImpl implements ActivitiesService {
	@Autowired
	private ActivitiesRepository actvRepository;

	@Override
	public List<Activities> getActivities() {
		return actvRepository.findAll();
	}

	@Override
	public Activities saveActivities(Activities actv) {
		return actvRepository.save(actv);
	}

}
