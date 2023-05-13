package com.enit.ProjectSpring11.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.enit.ProjectSpring11.Repository.ActivitiesDeptRepository;
import com.enit.ProjectSpring11.model.ActivitiesDept;
@Service
public class ActivitesDeptServiceImpl implements ActivitesDeptService {
	@Autowired
	private ActivitiesDeptRepository actdeptRepository;
	@Override
	public List<ActivitiesDept> getActivitesDepts() {
		return actdeptRepository.findAll();
	}

	@Override
	public ActivitiesDept saveActivitesDept(ActivitiesDept actdept) {
		return actdeptRepository.save(actdept);
	}

}
