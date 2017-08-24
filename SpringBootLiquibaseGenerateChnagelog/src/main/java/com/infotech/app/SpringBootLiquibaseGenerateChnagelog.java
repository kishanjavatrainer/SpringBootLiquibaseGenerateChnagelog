package com.infotech.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.infotech.app.entities.Employee;
import com.infotech.app.repository.EmployeeRepository;

@SpringBootApplication
public class SpringBootLiquibaseGenerateChnagelog implements CommandLineRunner{

	@Autowired
	private EmployeeRepository employeeRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootLiquibaseGenerateChnagelog.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Employee employee = getEmployee();
		employeeRepository.save(employee);
	}
	
	private Employee getEmployee() {
		Employee employee = new Employee();
		employee.setEmployeeName("Sean Murphy");
		employee.setEmail("sean.m@gmail.com");
		employee.setSalary(90000.00);
		return employee;
	}
}
