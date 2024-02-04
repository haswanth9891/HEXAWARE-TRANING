package com.hexaware.springrestjpa.restcontroller;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

import com.hexaware.springrestjpa.entities.Employee;

@SpringBootTest
class EmployeeRestControllerTest {
	
	
	
	@Autowired
	RestTemplate restTemplate;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@Test
	void testInsertEmployee() {
		
		Employee emp = new Employee(123, "MARY", 35000);
		
		ResponseEntity<Employee> response = restTemplate.postForEntity("http://localhost:8081/api/employees/add", emp, Employee.class);
		Employee e = response.getBody();
		assertEquals(emp.getEid(),e.getEid());
		
		
		
	}
	@Test
	void testUpdateEmployee() {
	    // Create an employee to be updated
	    Employee originalEmployee = new Employee(145, "MAY", 35000);

	    // Insert the original employee into the database
	    ResponseEntity<Employee> insertResponse = restTemplate.postForEntity("http://localhost:8081/api/employees/add", originalEmployee, Employee.class);
	    Employee insertedEmployee = insertResponse.getBody();
	    assertNotNull(insertedEmployee);

	    // Modify some details for the update
	    insertedEmployee.setSalary(40000);

	    // Perform the update
	    restTemplate.put("http://localhost:8081/api/employees/update", insertedEmployee);

	    // Retrieve the updated employee
	    ResponseEntity<Employee> response = restTemplate.getForEntity("http://localhost:8081/api/employees/get/" + insertedEmployee.getEid(), Employee.class);
	    Employee updatedEmployee = response.getBody();
	    assertNotNull(updatedEmployee);

	    // Assert that the salary has been updated
	    assertEquals(40000, updatedEmployee.getSalary());

	    // Clean up: Delete the employee after testing
	    restTemplate.delete("http://localhost:8081/api/employees/delete/" + insertedEmployee.getEid());
	}



	@Test
	void testGetEmployeeById() {
		int eid =121;
		
	ResponseEntity<Employee> response =	restTemplate.getForEntity("http://localhost:8081/api/employees/get/"+eid, Employee.class);
	Employee emp =	response.getBody();
	assertNotNull(emp);
	assertEquals(121,emp.getEid());
		
	}

	@Test
    void testDeleteEmployeeById() {
        
    }


	@Test
	void testGetAllEmployees() {
		
	ResponseEntity<List> response =	restTemplate.getForEntity("http://localhost:8081/api/employees/getall",List.class);
	      List<Employee>list = response.getBody();
	     
	      assertTrue(list.size() >0);
	      
	      
	      
	List<Employee> list2=      restTemplate.getForObject("http://localhost:8081/api/employees/getall",List.class);
		assertNotNull(list2);
	}

}
