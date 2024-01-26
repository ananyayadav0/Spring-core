package com.learn.spring.test1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/*
 * to check precedence 
 * 
 * 1.default
 * 2.param constructor
 * 3.setter
 */
public class App {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("springBean2.xml");
		
		Abcd abcd= (Abcd) context.getBean("abcd");
		System.out.print(abcd);
	}

}
