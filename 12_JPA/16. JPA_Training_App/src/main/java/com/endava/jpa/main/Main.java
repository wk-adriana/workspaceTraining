package com.endava.jpa.main;

import com.endava.jpa.model.Department;
import com.endava.jpa.model.Employee;
import com.endava.jpa.service.impl.JPAMainService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class Main {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		JPAMainService jpaMainService = (JPAMainService)context.getBean("JPAMainService");

		/**
		 * Comment unneeded method invocations.
		 */
		Department department = jpaMainService.findDepartment(1);
		System.out.println(department);
		List<Department> departmentList = jpaMainService.findDepartmentByName("HR");
		System.out.println(departmentList);

		jpaMainService.insertDepartment("AM");
		jpaMainService.updateDepartment(1, "Publicitatea");
		jpaMainService.deleteDepartment(3);

		jpaMainService.insertEmployee("Maria", 1000, department);
		List<Employee> employees = jpaMainService.getEmployeesFromBucharest(department);
		System.out.println(employees);
//		jpaMainService.giveSalaryRaise();
//		jpaMainService.removeEmployee();


	}
}
