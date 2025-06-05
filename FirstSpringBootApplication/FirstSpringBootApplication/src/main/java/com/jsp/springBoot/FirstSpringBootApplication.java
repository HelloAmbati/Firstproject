package com.jsp.springBoot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.jsp.springBoot.descriptionOfBean.Employee;

//To enable Auto-Configuration
@SpringBootApplication
public class FirstSpringBootApplication {

	// starts IOC container implicitly.
	//configurableApplicationContext implementation class of ApplicationContext interface
	//Spring boot performs Auto-configuration.
	public static void main(String[] args) {
		ApplicationContext context
		                          =SpringApplication.run(FirstSpringBootApplication.class, args);
		
		Employee emp=context.getBean(Employee.class);
		System.out.println(emp);
	}

}