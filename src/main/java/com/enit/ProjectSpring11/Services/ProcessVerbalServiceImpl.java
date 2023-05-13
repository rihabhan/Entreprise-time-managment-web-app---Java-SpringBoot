package com.enit.ProjectSpring11.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.enit.ProjectSpring11.Repository.AgendaDeptRepository;
import com.enit.ProjectSpring11.Repository.ProcessVerbalRepositroy;
import com.enit.ProjectSpring11.model.ProcessVerbal;
@Service
public class ProcessVerbalServiceImpl implements ProcessVerbalService {
	@Autowired
	private ProcessVerbalRepositroy pvRepository;
	@Override
	public List<ProcessVerbal> getProcessVerbals() {
		return pvRepository.findAll();
	}

	@Override
	public ProcessVerbal saveProcessVerbal(ProcessVerbal pv) {
		return pvRepository.save(pv);
	}

}
