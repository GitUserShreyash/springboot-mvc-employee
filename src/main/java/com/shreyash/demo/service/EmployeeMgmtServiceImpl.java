package com.shreyash.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shreyash.demo.model.Employee;
import com.shreyash.demo.repo.IEmployeeRepo;

@Service("empService")
public class EmployeeMgmtServiceImpl implements IEmployeeMgmtService{
	@Autowired
	private IEmployeeRepo repo;
	
	@Override
	public List<Employee> getAllEmployees() {
		return repo.findAll();
	}
	
	@Override
	public String registeEmployee(Employee emp) {
		int empno =repo.save(emp).getEmpno();
		return "Employee is saved with id "+empno;
	}

	@Override
	public Employee getEmployeeById(Integer id) {
		return repo.findById(id).get();
	}

	@Override
	public String editEmployee(Employee emp) {
		return "Employee is edited with id "+repo.save(emp).getEmpno();
	}

	@Override
	public String deleteEmployee(Integer id) {
		repo.deleteById(id);
		return "Employee is deleted with id "+id;
	}
	
	

}
