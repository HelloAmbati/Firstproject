package com.jsp.springBoot.descriptionOfBean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Employee {
	
	@Value("101")
	private int empid;
	@Value("QWERTY")
	private String ename;
	
	public Employee() {
		System.out.println("This is Employee class Consructor..!");
	}

	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", ename=" + ename + "]";
	}

	
	
}
