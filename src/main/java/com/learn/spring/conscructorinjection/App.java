package com.learn.spring.conscructorinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("springBean.xml");

		Book book = (Book) context.getBean("constructor");
		System.out.println(book);
	}

}
