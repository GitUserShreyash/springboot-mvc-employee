package com.shreyash.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.shreyash.demo.model.Employee;
@Repository
public interface IEmployeeRepo extends JpaRepository<Employee, Integer>{

}
