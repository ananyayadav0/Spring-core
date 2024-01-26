package com.learn.spring.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("springBean.xml");
		
		Samosa samosa = (Samosa) context.getBean("lifecycle");
		System.out.println(samosa);
		InterfaceSamosa samosa1 = (InterfaceSamosa) context.getBean("lifecycle1");
		System.out.println(samosa1);
		AnnotationSamosa samosa2 = (AnnotationSamosa) context.getBean("lifecycle2");
		System.out.println(samosa2);
		context.registerShutdownHook();//context given task to code cleanup by destroying
		
		/*
		 * enable pre shutdown on context by using AbstractApplicationContext, parent interface of Application Context
		 */
	}

}
