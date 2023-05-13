package com.enit.ProjectSpring11.Services;

import java.util.List;

import com.enit.ProjectSpring11.model.AgendaDept;

public interface AgendaDeptService {
	List <AgendaDept> getAgendaDepts();
	AgendaDept saveAgendaDept (AgendaDept agd);
}
