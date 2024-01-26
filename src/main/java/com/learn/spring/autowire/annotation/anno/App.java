package com.learn.spring.autowire.annotation.anno;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("springBean.xml");
		
		Employee employee = (Employee) context.getBean("employeeA");
		System.out.println(employee);

	}

}
