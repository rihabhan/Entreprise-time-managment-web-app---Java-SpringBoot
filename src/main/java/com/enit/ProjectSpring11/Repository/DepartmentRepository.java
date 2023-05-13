package com.enit.ProjectSpring11.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.enit.ProjectSpring11.model.Department;
@Repository
public interface DepartmentRepository extends JpaRepository<Department,Integer> {

}
