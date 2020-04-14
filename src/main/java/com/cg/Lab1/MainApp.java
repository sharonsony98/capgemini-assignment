package com.cg.Lab1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class MainApp {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		Employee employee = (Employee) context.getBean("employee");
		employee.show();
		((ClassPathXmlApplicationContext)context).close();
	}

}
