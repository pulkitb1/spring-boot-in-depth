package com.backend.crud.repository;

import com.backend.crud.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    // All CRUD Database methods

}
