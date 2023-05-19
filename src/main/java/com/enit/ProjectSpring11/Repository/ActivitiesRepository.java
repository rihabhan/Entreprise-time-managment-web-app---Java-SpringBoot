package com.enit.ProjectSpring11.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.enit.ProjectSpring11.model.Activities;
@Repository
public interface ActivitiesRepository extends JpaRepository<Activities, Integer> {

}
