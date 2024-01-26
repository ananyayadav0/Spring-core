package com.learn.spring.setterinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String a[]) {
		ApplicationContext context = new ClassPathXmlApplicationContext("springBean.xml");
		/*
		 * App obj1 = (App) context.getBean("dependencyInjection"); App obj2 = (App)
		 * context.getBean("IoC"); System.out.println(obj1); System.out.println(obj1);
		 */
		Components obj1 = (Components) context.getBean("component1");
		Components obj2 = (Components) context.getBean("component2");
		Components obj3 = (Components) context.getBean("component3");
		System.out.println(obj1);
		System.out.println(obj2);
		System.out.println(obj3);
	}
	
}

 