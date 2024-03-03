package com.hexaware.springrestjpa.service;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.hexaware.springrestjpa.entities.Employee;

import jakarta.transaction.Transactional;



@SpringBootTest
//@Transactional
class EmployeeServiceImpTest {
     
	Logger logger =LoggerFactory.getLogger(EmployeeServiceImpTest.class);
	
	@Autowired
	IEmployeeService service;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@Test
	@DisplayName("InsertEmployee")
	public void testAddEmployee() {
		Employee emp = new Employee(130, "SPIDER", 4000);
		Employee e1 = service.addEmployee(emp);
		
		logger.info("Employee Added Sucessfully");
		assertNotNull(e1);
		assertEquals(130, e1.getEid());
		
		
	}

	@Test
	void testUpdateEmployee() {
		
	}

	@Test
	void testGetAllEmployees() {
	
	
	}

	@Test
	void testGetEmployeeById() {
	Employee emp=service.getEmployeeById(1);
	assertEquals("Sneha",emp.getEname());
	}

}
