package com.learn.spring.javaconfigNoXml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

	public static void main(String[] args) {
		ApplicationContext context=new AnnotationConfigApplicationContext(Javaconfig.class);
		
		Student student= context.getBean("student",Student.class);
		student.studying();

		/*
		 *  Pupil pupil= context.getBean("getPupil",Pupil.class); 
		
		 * if using @Bean annotation, @Bean func name will be bean name
		 * 
		 */
		Pupil pupil= context.getBean("pupil",Pupil.class);
		pupil.studying();
	}

}
