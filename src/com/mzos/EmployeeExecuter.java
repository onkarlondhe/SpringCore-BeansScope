package com.mzos;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeExecuter {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Employee emp1 = (Employee) context.getBean("emp");
		System.out.println(emp1+"\t"+emp1.hashCode());
		
		Employee emp2 = (Employee) context.getBean("emp");
		System.out.println(emp2+"\t"+emp2.hashCode());
		
	}

}
