package com.enit.ProjectSpring11.Services;

import java.util.List;

import com.enit.ProjectSpring11.model.Alert;


public interface AlerteService {
	List <Alert> getAlertes();
	Alert saveAlertes (Alert a);
}
