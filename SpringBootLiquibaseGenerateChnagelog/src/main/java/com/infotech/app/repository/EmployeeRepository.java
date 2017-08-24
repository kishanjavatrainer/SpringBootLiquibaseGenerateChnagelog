package com.infotech.app.repository;

import org.springframework.data.repository.CrudRepository;

import com.infotech.app.entities.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Integer> {

}
