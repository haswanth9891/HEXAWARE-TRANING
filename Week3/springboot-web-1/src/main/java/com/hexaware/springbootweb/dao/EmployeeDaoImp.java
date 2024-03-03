package com.hexaware.springbootweb.dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import com.hexaware.springbootweb.entity.Employee;



@Repository
public class EmployeeDaoImp implements IEmployeeDao {
	
	
	JdbcTemplate jdbcTemplate;
	public EmployeeDaoImp() {

	}

	@Autowired
	public EmployeeDaoImp(DataSource datasource) {

		jdbcTemplate = new JdbcTemplate(datasource);

		System.out.println(jdbcTemplate);

	}

	@Override
	public String addEmployee(Employee emp) {

		String insert = "insert into Employee values(?,?,?)";

		int count = jdbcTemplate.update(insert, emp.getEid(), emp.getEname(), emp.getSalary());

		return count + " record inserted";
	}

	@Override
	public String updateEmployee(Employee emp) {
		
			String update = "update Employee set ename = ? , salary = ? where eid = ?";
		
			int count =	jdbcTemplate.update(update,emp.getEname() , emp.getSalary() , emp.getEid());
		
		return count +" record updated";
	}

	@Override
	public String deleteEmployee(int eid) {


		String delete = "delete from Employee where eid = ?";
		
		int count =		jdbcTemplate.update(delete, eid);
		
		return count +"record deleted successfully";
	}

	@Override
	public List<Employee> getAll() {

		String select = "select eid,ename,salary from Employee";

		List<Employee> list = jdbcTemplate.query(select, new EmployeeMapper());

		return list;
	}

	@Override
	public Employee getEmployeeById(int eid) {
		String query = "select eid,ename,salary from Employee where eid=?";
		return jdbcTemplate.queryForObject(query,new EmployeeMapper(),eid );

		 
	}

}
