package com.endava.jpa.main;

import com.endava.jpa.service.impl.JPAMainService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		JPAMainService jpaMainService = (JPAMainService)context.getBean("JPAMainService");

		/**
		 * Comment unneeded method invocations.
		 */
		jpaMainService.findDepartment(1);
		jpaMainService.findDepartmentByName("HR");


//		jpaMainService.insertDepartment("AM");
		jpaMainService.updateDepartment(1, "Publicitatea");
		jpaMainService.deleteDepartment(4);
//		jpaMainService.insertEmployee();
//		jpaMainService.getEmployeesFromBucharest();
//		jpaMainService.giveSalaryRaise();
//		jpaMainService.removeEmployee();


	}
}
