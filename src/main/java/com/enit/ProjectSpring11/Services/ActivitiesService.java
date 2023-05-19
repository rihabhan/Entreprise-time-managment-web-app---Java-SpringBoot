package com.enit.ProjectSpring11.Services;

import java.util.List;

import com.enit.ProjectSpring11.model.Activities;

public interface ActivitiesService {
	List <Activities> getActivities();
	Activities saveActivities (Activities actv);
}
