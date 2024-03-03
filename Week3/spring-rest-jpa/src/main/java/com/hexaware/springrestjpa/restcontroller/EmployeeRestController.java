package com.hexaware.springrestjpa.restcontroller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hexaware.springrestjpa.entities.Employee;
import com.hexaware.springrestjpa.exception.EmployeeNotFoundException;
import com.hexaware.springrestjpa.service.EmployeeServiceImp;
import com.hexaware.springrestjpa.service.IEmployeeService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/employees")
public class EmployeeRestController {
	
	
	@Autowired
	IEmployeeService service;
	
	Logger logger =	LoggerFactory.getLogger(EmployeeRestController.class);
	
	@PostMapping("/add")
	public Employee insertEmployee(@RequestBody Employee emp) {
		
		boolean  isValid =	EmployeeServiceImp.validateEmployeeData(emp);
		logger.info("EmployeeRestController executed..");
		Employee employee = null;
		
			if(isValid) {
				
				employee = service.addEmployee(emp);
				
				logger.warn("employee object is not null in RestController");
			}
			logger.debug("debugging from RestController");

		return employee;

	}
	
	@PutMapping("/update")
	public Employee  updateEmployee(@RequestBody @Valid   Employee emp) {

		return service.updateEmployee(emp);

	}
	
	@GetMapping("/get/{eid}")
	public Employee  getEmployeeById(@PathVariable  int eid) throws EmployeeNotFoundException {
		
		Employee emp = service.getEmployeeById(eid);
		if (emp == null) {
			throw new EmployeeNotFoundException();
			
		}
		return emp;
	}
	
	
	@DeleteMapping("/delete/{eid}")
	public String deleteEmployeeById(@PathVariable int eid ) {
		
		
		return service.deleteEmployeeById(eid);
			
	}
	
	@GetMapping("/getall")
	public List<Employee> getAllEmployees(){
		
		return service.getAllEmployees();
			
	}
	@GetMapping("/getbyename/{ename}")
	public List<Employee> getByEname(@PathVariable String ename){
		
		return service.getByEname(ename);
			
	}
	
	@GetMapping("/getbysalary/{salary}")
	public List<Employee> getBySalary(@PathVariable double salary){
		return service.getBySalaryGT(salary);
		
	}
	
	@GetMapping("/getsalarysorted")
	public List<Employee> getBySalarySorted(){
		return service.getBySalarySorted();
	}
	
	@GetMapping("/getsalarybyrange/{min}/{max}")
	public List<Employee>  getBySalarySorted(@PathVariable double min , @PathVariable double max){
		
		
		return service.getBySalaryRange(min, max);
		
	}
	
	
	
	
	@DeleteMapping("/deletebyename/{ename}")
	public String deleteByEname(@PathVariable String ename) {
		int count = service.deleteByEname(ename);
		return count + "record deleted";
		
	}
}
