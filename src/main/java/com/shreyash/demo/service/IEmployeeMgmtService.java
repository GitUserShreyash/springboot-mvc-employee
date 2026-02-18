package com.shreyash.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.shreyash.demo.model.Employee;

@Service
public interface IEmployeeMgmtService {
	public List<Employee> getAllEmployees();
	public String registeEmployee(Employee emp);
	public Employee getEmployeeById(Integer id);
	public String editEmployee(Employee emp);
	public String deleteEmployee(Integer id);
}
