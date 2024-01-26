package com.learn.spring.component;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.spel.standard.SpelExpressionParser;

/*
 * @Component
 * @Qualifier
 * @Scope
 * @Value
 * SpEL
 */
public class App {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("springBean2.xml");
		
		Student student= (Student) context.getBean("student",Student.class);
		System.out.println(student); 
		System.out.println(student.getSubjects().getClass());
		System.out.println(student.hashCode());
		Student student1= (Student) context.getBean("student",Student.class);
		System.out.println(student1.hashCode());

		/*
		 * hashCode is same for both , this is singleton scope
		 * to change scope, either use scope="prot" in xml or use @Scope("prototype) after @Component
		 */
		Teacher teacher = (Teacher) context.getBean("teacher",Teacher.class);
		Teacher teacher1 = (Teacher) context.getBean("teacher",Teacher.class);
		System.out.println("teacher="+teacher.hashCode());
		System.out.println("teacher1="+teacher1.hashCode());
		/*
		 * teacher has codes are different since scope is defined in beans
		 */
		
		SpelExpressionParser temp= new SpelExpressionParser();
		System.out.println(temp.parseExpression("1+2+3").getValue());
	}

}
