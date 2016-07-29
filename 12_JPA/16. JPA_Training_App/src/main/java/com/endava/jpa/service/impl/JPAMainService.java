package com.endava.jpa.service.impl;

import com.endava.jpa.model.Department;
import com.endava.jpa.model.Employee;
import com.endava.jpa.model.Project;
import com.endava.jpa.service.DepartmentService;
import com.endava.jpa.service.EmployeeService;
import com.endava.jpa.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JPAMainService {

	private static final String BUCHARTEST = "Bucuresti";
	private static final String PROJECT_NAME_ENDAVA = "Endava";

	@Autowired
	private DepartmentService departmentService;

	@Autowired
	private EmployeeService employeeService;

	@Autowired
	private ProjectService projectService;

	//-------------------------------------- Department -----------------------------/

	public Department findDepartment(int id) {
		return departmentService.find(id);
	}

	public List<Department>  findDepartmentByName(String name) {
		return departmentService.find(name);
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
		if (department != null) {
			department.setName(name);
			departmentService.update(department);
		}
	}

	/**
	 * Delete an existing department from the database
	 */
	public void deleteDepartment(int id) {
		Department department = departmentService.find(id);
		if (department != null) {
			departmentService.remove(department);
		}
	}

	//-------------------------------------- Employee -----------------------------/
	/**
	 * Create a new employee entity and save it into the corresponding table
	 */
	public void insertEmployee(String name, int salary, Department department) {
		Employee employee = new Employee();
		employee.setName(name);
		employee.setSalary(salary);
		employee.setDepartment(department);
		employeeService.save(employee);
	}

	/**
	 * Print to stdout all the employees from 'Bucharest', which belong to the department with id = 1.
	 * Make sure that there are more than two employees in Bucharest which belong to the department with id=1 when populating the DB.
	 * ! Use a join query.
	 */
	public  List<Employee> getEmployeesFromBucharest(Department department){
		return employeeService.find(BUCHARTEST, department);
	}

	/**
	 * Give a salary raise(+10%) for all employees that work in the 'Endava' project (project name = 'Endava').
	 * ! Use a join query.
	 */
	public void giveSalaryRaise(){}


	//-------------------------------------- Project -----------------------------/

	/**
	 * Add a new employee to the 'Endava' project. (project name = 'Endava')
	 */
	public void addEmployee(Employee employeeToAdd){
		Project project = projectService.find(PROJECT_NAME_ENDAVA);
		// ???? What db relation
	}

	/**
	 * Remove an employee from a project which has 'John Doe' as project manager.
	 */
	public void removeEmployee(Employee employeeToRemove){}

}
