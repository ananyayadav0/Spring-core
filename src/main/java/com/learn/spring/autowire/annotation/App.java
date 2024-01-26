package com.learn.spring.autowire.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("springBean.xml");
		
		Employee employee = (Employee) context.getBean("employee");
	//	Employee employee = (Employee) context.getBean("employee1");
	//	Employee employee = (Employee) context.getBean("employee2");
		System.out.println(employee);

	}

}
