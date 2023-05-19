package com.enit.ProjectSpring11.Services;

import java.util.List;

import com.enit.ProjectSpring11.model.AgendaDept;
import com.enit.ProjectSpring11.model.Department;

public interface AgendaDeptService {
	List <AgendaDept> getAgendaDepts();
	AgendaDept saveAgendaDept (AgendaDept agd);
}