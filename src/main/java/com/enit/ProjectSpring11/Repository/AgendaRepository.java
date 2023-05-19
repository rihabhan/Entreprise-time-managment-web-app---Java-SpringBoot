package com.enit.ProjectSpring11.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.enit.ProjectSpring11.model.Agenda;
@Repository
public interface AgendaRepository extends JpaRepository<Agenda, Integer> {

}
