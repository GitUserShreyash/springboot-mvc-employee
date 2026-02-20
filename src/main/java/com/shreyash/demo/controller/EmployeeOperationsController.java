package com.shreyash.demo.controller;

import java.net.http.HttpRequest;
import java.util.List;
import java.util.Map;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.shreyash.demo.model.Employee;
import com.shreyash.demo.service.EmployeeMgmtServiceImpl;
import com.shreyash.demo.service.IEmployeeMgmtService;

@Controller
public class EmployeeOperationsController {

    
	
	@Autowired
	private IEmployeeMgmtService empService;


	@GetMapping("/")
	public String showHome() {
		return "home";
	}
	
	@GetMapping("/report")
	public String showAllEmployeesReport(Map<String,Object> map) {
	    List<Employee> emplist = empService.getAllEmployees();
	    map.put("empData", emplist);
	    return "employee_report";
	}
	
	@GetMapping("/add")
	public String showAddEmployeeForm() {
		return "employee_register";
	}
	
	@PostMapping("/register")
	public String registerEmployee(@ModelAttribute Employee emp,RedirectAttributes attrs) {
		String resultMsg = empService.registeEmployee(emp);
		attrs.addFlashAttribute("resultMsg", resultMsg);
		List<Employee> emplist = empService.getAllEmployees();
		attrs.addFlashAttribute("empData", emplist);
		return "redirect:report"; 
	}
	
	@GetMapping("/edit")
	public String showEditEmployeeForm(@RequestParam("no") Integer empno,@ModelAttribute("emp") Employee emp) {
		Employee emp1 = empService.getEmployeeById(empno);
		System.out.println(emp1.toString());
		BeanUtils.copyProperties(emp1,emp);
		return "employee_edit";
	}
	
	@PostMapping("/edit_emp")
	public String editEmployee(@ModelAttribute("emp") Employee emp, RedirectAttributes attrs) {
		String resultMsg = empService.editEmployee(emp);
		attrs.addFlashAttribute("resultMsg", resultMsg);
		List<Employee> emplist = empService.getAllEmployees();
		attrs.addFlashAttribute("empData", emplist);
		return "redirect:report"; 
	}
	
	@GetMapping("/delete")
	public String deleteEmployee(@RequestParam("no") Integer empno,RedirectAttributes attrs) {
		String resultMsg = empService.deleteEmployee(empno);
		attrs.addFlashAttribute("resultMsg", resultMsg);
		List<Employee> emplist = empService.getAllEmployees();
		attrs.addFlashAttribute("empData", emplist);
		return "redirect:report";
	}
}
