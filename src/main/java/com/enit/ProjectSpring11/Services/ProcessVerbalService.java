package com.enit.ProjectSpring11.Services;

import java.util.List;

import com.enit.ProjectSpring11.model.Employee;
import com.enit.ProjectSpring11.model.ProcessVerbal;

public interface ProcessVerbalService {
	List <ProcessVerbal> getProcessVerbals();
	ProcessVerbal saveProcessVerbal (ProcessVerbal pv);
}
