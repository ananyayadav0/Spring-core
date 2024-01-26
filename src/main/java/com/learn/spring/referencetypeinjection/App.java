package com.learn.spring.referencetypeinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("springBean.xml");
		
		A obj= (A) context.getBean("reference");
		System.out.println(obj);

	}

}
