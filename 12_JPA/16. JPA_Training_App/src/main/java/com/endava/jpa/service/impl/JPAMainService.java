package com.endava.jpa.service.impl;

import com.endava.jpa.model.Department;
import com.endava.jpa.service.DepartmentService;
import com.endava.jpa.service.EmployeeService;
import com.endava.jpa.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JPAMainService {

	@Autowired
	private DepartmentService departmentService;

	@Autowired
	private EmployeeService employeeService;

	@Autowired
	private ProjectService projectService;

	//-------------------------------------- Department -----------------------------/

	public Department findDepartment(int id) {
		Department department = departmentService.find(id);
		System.out.println(department);
		return department;
	}

	public void  findDepartmentByName(String name) {
		List<Department> departments = departmentService.find(name);
		for(Department department : departments) {
//			departments.add(department);
			System.out.println(department);
		}
	}
	/**
	 *   Define a new department entity and insert it into the corresponding table
	 */
	 public void insertDepartment(String departmentName) {
		 Department department = new Department();
		 department.setName(departmentName);
		 departmentService.save(department);
	 }

	 /**
	 * Search for an existing department, update its name and save it using the new name
	 */
	public void updateDepartment(int id, String name) {
		Department department = departmentService.find(id);
		department.setName(name);
		departmentService.update(department);
	}

	/**
	 * Delete an existing department from the database
	 */
	public void deleteDepartment(int id) {
		Department department = departmentService.find(id);
		departmentService.remove(department);
	}

	//-------------------------------------- Employee -----------------------------/
	/**
	 * Create a new employee entity and save it into the corresponding table
	 */
	public void insertEmployee() {}

	/**
	 * Print to stdout all the employees from 'Bucharest', which belong to the department with id = 1.
	 * Make sure that there are more than two employees in Bucharest which belong to the department with id=1 when populating the DB.
	 * ! Use a join query.
	 */
	public void getEmployeesFromBucharest(){}

	/**
	 * Give a salary raise(+10%) for all employees that work in the 'Endava' project (project name = 'Endava').
	 * ! Use a join query.
	 */
	public void giveSalaryRaise(){}


	//-------------------------------------- Project -----------------------------/

	/**
	 * Add a new employee to the 'Endava' project. (project name = 'Endava')
	 */
	public void addEmployee(){}

	/**
	 * Remove an employee from a project which has 'John Doe' as project manager.
	 */
	public void removeEmployee(){}

}
