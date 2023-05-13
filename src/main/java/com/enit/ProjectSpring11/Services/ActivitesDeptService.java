package com.enit.ProjectSpring11.Services;

import java.util.List;

import com.enit.ProjectSpring11.model.ActivitiesDept;
import com.enit.ProjectSpring11.model.AgendaDept;

public interface ActivitesDeptService {
	List <ActivitiesDept> getActivitesDepts();
	ActivitiesDept saveActivitesDept (ActivitiesDept actdept);
}
