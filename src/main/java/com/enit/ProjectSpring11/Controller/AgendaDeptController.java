package com.enit.ProjectSpring11.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.enit.ProjectSpring11.Services.AgendaDeptService;
import com.enit.ProjectSpring11.model.ActivitiesDept;
import com.enit.ProjectSpring11.model.Agenda;
import com.enit.ProjectSpring11.model.AgendaDept;

@Controller
public class AgendaDeptController {
    @Autowired
    private final AgendaDeptService agdservice;

    public AgendaDeptController(AgendaDeptService agdservice) {
        this.agdservice = agdservice;
    }

    @GetMapping("/agendadepts")
    public String getAgendaDepts(Model model) {
        List<AgendaDept> agendaDepts = agdservice.getAgendaDepts();
        model.addAttribute("agendadepts", agendaDepts);
        return "agendadepts";
    }
    @PostMapping("/agendadepts")
    public AgendaDept addAgendaDept(@RequestBody AgendaDept agendaDepts ) {
       
        return  agdservice.saveAgendaDept(agendaDepts);
    }
}
