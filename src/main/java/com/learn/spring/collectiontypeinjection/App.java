package com.learn.spring.collectiontypeinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("springBean.xml");
		
		Student student = (Student) context.getBean("collection");
		System.out.println(student);

	}

}
