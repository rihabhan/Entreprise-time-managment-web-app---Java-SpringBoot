package com.enit.ProjectSpring11.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.enit.ProjectSpring.model.Employee;
@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
